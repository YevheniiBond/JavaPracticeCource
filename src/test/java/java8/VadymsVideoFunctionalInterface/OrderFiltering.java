package java8.VadymsVideoFunctionalInterface;

import java.util.List;

public class OrderFiltering {
    List<Order> orderList;

    OrderFiltering(List<Order> orderList){
        this.orderList = orderList;
    }

    public void printVegan() {
        for (Order order : orderList) {
            if (order.isVegan) {
                System.out.println(order);
            }
        }
    }
        public void printPriceLowerThan100() {
            for (Order order : orderList) {
                if (order.price < 100) {
                    System.out.println(order);
                }
            }
        }

        public void highterThan1000(){
        for(Order order : orderList){
            if(order.price>1000){
                System.out.println(order);
            }
        }
    }
}