package java8.VadymsVideoFunctionalInterface;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestOrder {

    @Test
    public void checkOrder() {
        Order firstOrder = new Order(250, false, "Vasya");
        Order secondOrder = new Order(50, true, "Kolya");
        Order thirdOrder = new Order(120, false, "Max");
        Order fourthOrder = new Order(150, true, "Danylo");
        Order fifthOrder = new Order(300, true, "Vlad");
        Order sixOrder = new Order(350, false, "Mykola");
        Order sevenOrder = new Order(400, false, "Olena");
        Order eightOrder = new Order(2500, true, "Ludmyla");
        Order nineOrder = new Order(25, true, "Svitlana");
        Order tenOrder = new Order(40, false, "Anna");
        Order elevenOrder = new Order(80, false, "Serhii");

        List<Order> orderList = Arrays.asList(firstOrder, secondOrder, thirdOrder, fourthOrder,
                fifthOrder, sixOrder, sevenOrder, eightOrder, nineOrder, tenOrder, elevenOrder);


        printConditions(orderList, new OrderCheck() {
            @Override
            public boolean checkCondition(Order order) {
                return order.price > 400;
            }
        });
    }

    public void printConditions(List<Order> orderList, OrderCheck orderCheck ){
        for( Order order : orderList){
            if (orderCheck.checkCondition(order)){
                System.out.println(order);
            }
        }
    }
}