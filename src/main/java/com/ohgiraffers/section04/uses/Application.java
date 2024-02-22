package com.ohgiraffers.section04.uses;

public class Application {
    public static void main(String[] args) {

        Application app1 = new Application();

        FireCar fireCar = new FireCar();

        fireCar.go();
        fireCar.horn();
        fireCar.stop();
        fireCar.slide();

        Car car1 = new FireCar();
        car1.go();
    }



}
