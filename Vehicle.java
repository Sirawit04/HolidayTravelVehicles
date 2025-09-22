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


   void getVehicleinformation() {
       System.out.println("Vehicle: " + this.serialNum + " " + this.year + " " +  this.name);

   }
}
