public class DealerOption {
    String optionCode;
    String description;
    double price;

    DealerOption(String code, String desc, double p) {
        optionCode = code;
        description = desc;
        price = p;
    }

    void showOption() {
        System.out.println("Option: " + description + " ($" + price + ")");
    }
}
