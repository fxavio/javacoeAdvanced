package Intermediate.Exercise1week1MethodPattern;
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
