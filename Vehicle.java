public class Vehicle {
    String serialNum;
    String name;
    String model;
    int year;
    String manufacturer;
    double baseCost;

    Vehicle(String sn, String n, String m, int y, String manu, double cost) {
        serialNum = sn;
        name = n;
        model = m;
        year = y;
        manufacturer = manu;
        baseCost = cost;
    }

    void updateInventory() {
        System.out.println("Vehicle " + name + " added to inventory.");
    }
}
