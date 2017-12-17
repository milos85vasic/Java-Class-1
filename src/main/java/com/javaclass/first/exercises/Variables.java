package com.javaclass.first.exercises;

/**
 * This is the first class we create.
 * It contains some examples of Java basic data types and working with comments.
 */
public class Variables { // This is example of one line comment.
    /*
     * Another multiline comment.
     * Second row.
     */

    // Example of code before the comment and the comment after the code:
    int x = 0; // Another single line comment: int x = 0;

    int number;                     // Default value is 0.
    Integer numberClazz;            // We got null!
    Integer numberClazz2 = 0;       // We got Integer instance with value of 0.
    float decimals = 3.14f;
    double decimals2 = 3.14;
    Float decimals3 = 3.14f;
    Double decimals4 = 3.14;
    Float decimals5;
    Double decimals6;
    int number2 = 1000;

    public static void main(String[] args) {
        Variables first = new Variables();  // Creating a new instance of class 'Variables'.
        System.out.println("variable 'number': " + first.number);
        System.out.println("variable 'numberClazz': " + first.numberClazz);
        System.out.println("variable 'numberClazz2': " + first.numberClazz2);
        System.out.println("variable 'decimals': " + first.decimals);
        System.out.println("variable 'decimals2': " + first.decimals2);
        System.out.println("variable 'decimals3': " + first.decimals3);
        System.out.println("variable 'decimals4': " + first.decimals4);
        System.out.println("variable 'decimals5' [1]: " + first.decimals5);
        System.out.println("variable 'decimals6' [1]: " + first.decimals6);
        first.decimals6 = (double) first.decimals; // Variables example of casting data.
        System.out.println("variable 'decimals6' [2]: " + first.decimals6);
        first.decimals = 5.55f;
        System.out.println("variable 'decimals6' [3]: " + first.decimals6);
        Float decimalsTmp = 100.1f;
        first.decimals5 = decimalsTmp;
        System.out.println("variable 'decimals5' [2]: " + first.decimals5);
        decimalsTmp = 200.2f;
        System.out.println("variable 'decimals5' [3]: " + first.decimals5);
        // We will create a new 'Variables' class instance:
        Variables second = first; // Pass by reference!
        System.out.println("variable 'number' from 'second' var. instance [1]: " + second.number2);
        first.number2 = 2000; // REMEMBER: Pass by reference!
        System.out.println("variable 'number' from 'second' var. instance [2]: " + second.number2);
    }
}
