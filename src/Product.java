public class Product implements Priceable{
    private int price;
    private String type;

    public Product(String type, int price) {
        this.price = price;
        this.type = type;
    }

    @Override
    public void getPrice() {
        System.out.println("Цена " + type + ": " + this.price + " рублей");
    }

    public String getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
}
