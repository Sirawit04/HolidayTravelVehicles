public class Customer {
    String customerID;
    String customerName;
    String customerAddress;
    String customerNumber;

    Customer(String id, String name, String address, String number) {
        customerID = id;
        customerName = name;
        customerAddress = address;
        customerNumber = number;
    }

    void requestPurchase() {
        System.out.println(customerName + " wants to buy a vehicle.");
    }
}
