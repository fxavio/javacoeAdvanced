package org.micro.stockpricemonitoring.products;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.rxjava3.core.Observable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class StockPriceService {
    private final WebClient webClient = WebClient.create();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @SuppressWarnings("unchecked")
    public Observable<Product> getStockPriceData() {
        return Observable.fromPublisher(
                webClient.get()
                        .uri("https://dummyjson.com/products")
                        .retrieve()
                        .bodyToMono(String.class)
                        .flux()
        ).flatMap(jsonString -> {
            try {
                Map<String, Object> responseMap = objectMapper.readValue(jsonString, new TypeReference<>() {});
                List<Map<String, Object>> products = (List<Map<String, Object>>) responseMap.get("products");
                return Observable.fromIterable(objectMapper.convertValue(products, new TypeReference<>() {}));
            } catch (IOException e) {
                return Observable.error(e);
            }
        });
    }
}
