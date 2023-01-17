package Primitives;

import java.util.Arrays;

public class CarObject {
    int id;
    String color;
    String type;
    String model;
    int data;
    double price;
    int registryNumber;

    public CarObject(int id, String color, String type, String model, int data, double price, int registryNumber) {
        this.id = id;
        this.color = color;
        this.type = type;
        this.model = model;
        this.data = data;
        this.price = price;
        this.registryNumber = registryNumber;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", data=" + data +
                ", price=" + price +
                ", registryNumber=" + registryNumber +
                '}';
    }

    public static void main(String[] args) {
        CarObject car1 = new CarObject(1,"red","cuper","V45",2015, 45.999, 777);
        CarObject car2 = new CarObject(2,"blue","zhuk","A34",2019, 40.999, 888);
        CarObject car3 = new CarObject(3,"silver","sedan","T67",2022, 60.999, 678);
        CarObject[] cars ={car1,car2,car3};
        for (CarObject car:cars) {
            if(car.type.equals("cuper"))
                System.out.println(car);
        }
        Arrays.stream(cars).allMatch(x ->x.type.equals("cuper"));

    }
}
