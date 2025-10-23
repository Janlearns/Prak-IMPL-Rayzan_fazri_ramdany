public class Item {
    private String name;
    private double price;

    public Item() {
        this.name = "Unknown";
        this.price = 0.0;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
