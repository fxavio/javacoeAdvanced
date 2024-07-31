package Intermediate.Exercise1week1MethodPattern;
public class LogisticsApp {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
