public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String color) {
        System.out.println("It's working!");
        this.id = id;
        this.color = color;
        this.name = name;
        this.price = price;
        this.descriptions = description;
        this.stock = stockAmount;
    }

    //attribute & field
    private String name;
    private String descriptions;
    private double price;
    private int stock;
    private int id;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
