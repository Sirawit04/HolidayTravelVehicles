public class SaleInvoice {
    String invoiceNumber;
    String date;
    double totalPrice;

    SaleInvoice(String num, String d, double price) {
        invoiceNumber = num;
        date = d;
        totalPrice = price;
    }

    void showInvoice() {
        System.out.println("Invoice " + invoiceNumber + " on " + date + " total: $" + totalPrice);
    }
}
