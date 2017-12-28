package com.javaclass.first.exercises;

class Car {

    public Car(String model) {
        this.model = model;
    }

    String model;

}

public class PassByReferenceExample {

    public static void main(String[] args){
        System.out.println("Demonstrating pass by reference:");
        Car car1 = new Car("BMW");
        Car car2 = new Car("Mercedes");
        Car car3 = car2;
        Car car4 = car2;
        System.out.println("Car 1 -> " + car1.model);
        System.out.println("Car 2 -> " + car2.model);
        System.out.println("Car 3 -> " + car3.model);
        System.out.println("Car 4 -> " + car4.model);
        System.out.println("- - - - - - - - - - - ");
        car4.model = "Fiat";
        System.out.println("Car 1 -> " + car1.model);
        System.out.println("Car 2 -> " + car2.model);
        System.out.println("Car 3 -> " + car3.model);
        System.out.println("Car 4 -> " + car4.model);
        System.out.println("- - - - - - - - - - - ");
        car3 = new Car("Audi");
        car4.model = "Mercedes";
        System.out.println("Car 1 -> " + car1.model);
        System.out.println("Car 2 -> " + car2.model);
        System.out.println("Car 3 -> " + car3.model);
        System.out.println("Car 4 -> " + car4.model);
        System.out.println("- - - - - - - - - - - ");
        car4 = car3;
        car3.model = "Renault";
        System.out.println("Car 1 -> " + car1.model);
        System.out.println("Car 2 -> " + car2.model);
        System.out.println("Car 3 -> " + car3.model);
        System.out.println("Car 4 -> " + car4.model);
        System.out.println("- - - - - - - - - - - ");
        car4 = new Car("Cherry");
        System.out.println("Car 1 -> " + car1.model);
        System.out.println("Car 2 -> " + car2.model);
        System.out.println("Car 3 -> " + car3.model);
        System.out.println("Car 4 -> " + car4.model);
        System.out.println("- - - - - - - - - - - ");
    }

}
