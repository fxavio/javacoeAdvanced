package Intermediate.Exercise1week1MethodPattern;

public abstract class Logistics {
    public abstract Transport createTransport();
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

