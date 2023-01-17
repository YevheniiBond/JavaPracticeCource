package java8.VadymsVideoFunctionalInterface;

public class Order{

    int price;
    boolean isVegan;
    String customerName;

    public Order(int price, boolean isVegan, String customerName) {
        this.price = price;
        this.isVegan = isVegan;
        this.customerName = customerName;
    }

    @Override
    public String toString(){
        return "Your order price is " + price + "," +
                " is Vegan? - " + isVegan + ", customer name - " + customerName + ";";
    }
}