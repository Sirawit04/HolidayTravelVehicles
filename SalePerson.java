public class SalePerson {
    String saleID;
    String name;
    String contactInfo;

    SalePerson(String id, String n, String c) {
        saleID = id;
        name = n;
        contactInfo = c;
    }

    void createInvoice() {
        System.out.println("Salesperson " + name + " created an invoice.");
    }
}
