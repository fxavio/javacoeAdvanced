package org.micro.stockpricemonitoring;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Arrays;
import java.util.List;
public class RxJavaExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Item1", "Item2", "Item3", "Item4");
        Disposable disposable = Observable.fromIterable(items)
                .filter(item -> item.startsWith("Item"))
                .map(String::toUpperCase)
                .subscribe(System.out::println);
        disposable.dispose();
    }
}
