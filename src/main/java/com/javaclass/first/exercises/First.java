package com.javaclass.first.exercises;

/**
 * This is the first class we create.
 * It contains some examples of Java basic data types and working with comments.
 */
public class First { // This is example of one line comment.
    /*
     * Another multiline comment.
     * Second row.
     */

    // Example of code before the comment and the comment after the code:
    int x = 0; // Another single line comment: int x = 0;

    int number;                     // Default value is 0.
    Integer numberClazz;            // We got null!
    Integer numberClazz2 = 0;       // We got Integer instance with value of 0.

    public static void main(String[] args) {
        First first = new First();
        System.out.println("variable 'number': " + first.number);
        System.out.println("variable 'numberClazz': " + first.numberClazz);
        System.out.println("variable 'numberClazz': " + first.numberClazz2);
    }
}
