package com.javaclass.first.exercises;

public class PassByValueExample {

    public static void main(String[] args) {
        System.out.println("Demonstrating pass by reference (continued):");
        Integer int1 = 5;
        Integer int2 = 7;
        Integer int3 = int2;
        Integer int4 = int2;
        System.out.println("Car 1 -> " + int1);
        System.out.println("Car 2 -> " + int2);
        System.out.println("Car 3 -> " + int3);
        System.out.println("Car 4 -> " + int4);
        System.out.println("- - - - - - - - - - - ");
        int4 = 10;
        System.out.println("Car 1 -> " + int1);
        System.out.println("Car 2 -> " + int2);
        System.out.println("Car 3 -> " + int3);
        System.out.println("Car 4 -> " + int4);
        System.out.println("- - - - - - - - - - - ");
        int3 = 11;
        int4 = 12;
        System.out.println("Car 1 -> " + int1);
        System.out.println("Car 2 -> " + int2);
        System.out.println("Car 3 -> " + int3);
        System.out.println("Car 4 -> " + int4);
        System.out.println("- - - - - - - - - - - ");
        int4 = int3;
        int3 = 13;
        System.out.println("Car 1 -> " + int1);
        System.out.println("Car 2 -> " + int2);
        System.out.println("Car 3 -> " + int3);
        System.out.println("Car 4 -> " + int4);
        System.out.println("- - - - - - - - - - - ");
        int4 = 14;
        System.out.println("Car 1 -> " + int1);
        System.out.println("Car 2 -> " + int2);
        System.out.println("Car 3 -> " + int3);
        System.out.println("Car 4 -> " + int4);
        System.out.println("- - - - - - - - - - - ");
    }

}
