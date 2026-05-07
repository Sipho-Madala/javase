package madala.learning.oop.masterclassone.demo;

import madala.learning.oop.masterclassone.model.Car;

public class MainApp {
    public static void main(String[] args) {

        Car car = new Car();
        car.describeCar();

        car.setColor("Blue");
        car.setConvertible(true);
        car.setMake("Ford");
        car.setModel("BMW");
        car.setDoors(5);
        car.describeCar();
    }
}
