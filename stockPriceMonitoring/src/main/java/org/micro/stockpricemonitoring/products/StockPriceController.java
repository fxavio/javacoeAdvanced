package org.micro.stockpricemonitoring.products;

import io.reactivex.rxjava3.core.Observable;
import org.micro.stockpricemonitoring.products.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StockPriceController {
    private final StockPriceService stockPriceService;
    public StockPriceController(StockPriceService stockPriceService) {
        this.stockPriceService = stockPriceService;
    }

    @GetMapping("/stock-prices")
    public Observable<Product> getStockPriceData(@RequestParam(required = false) String filter) {
        return  stockPriceService.getStockPriceData()
                .filter(product -> filter == null || product.getTitle().contains(filter));

    }
}
