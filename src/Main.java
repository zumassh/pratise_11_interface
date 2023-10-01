public class Main{
    public static void main(String[] args) {
        Priceable myCar = new Car("Peugeot", "grey",600000);
        Priceable bread = new Product("хлеб", 50);
        //System.out.println(myCar.getModel());
        myCar.getPrice();

        //System.out.println(bread.getType());
        bread.getPrice();
    }
}