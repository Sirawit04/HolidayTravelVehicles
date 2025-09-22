public class TradeInVehicle {
    String serialNum;
    String make;
    String model;
    int year;

    TradeInVehicle(String sn, String mk, String m, int y) {
        serialNum = sn;
        make = mk;
        model = m;
        year = y;
    }

    void evaluateTradeIn() {
        System.out.println("Trade-in checked: " + make + " " + model);
    }
}
