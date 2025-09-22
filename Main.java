public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("V001", "Toyota Corolla", "Corolla", 2022, "Toyota", 20000);
        v.updateInventory();

        Customer c = new Customer("C001", "John Doe", "123 Main St", "555-1234");
        c.requestPurchase();

        SalePerson sp = new SalePerson("S001", "Alice", "alice@sales.com");
        sp.createInvoice();

        TradeInVehicle tiv = new TradeInVehicle("T001", "Honda", "Civic", 2018);
        tiv.evaluateTradeIn();

        DealerOption opt = new DealerOption("D001", "Leather Seats", 1200);
        opt.showOption();

        SaleInvoice inv = new SaleInvoice("INV001", "2025-09-22", 21200);
        inv.showInvoice();
    }
}
