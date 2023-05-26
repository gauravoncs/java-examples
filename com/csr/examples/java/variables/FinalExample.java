package com.csr.examples.java.variables;

public class FinalExample {
    public static void main(String[] args) {
        final double PI = 3.14159265; // initialization
        final int max;
        max = Math.max(1, 2); // Only once max can be assigned as it's final
        // PI = 3.0; // Can't do it
        System.out.printf("PI = %f, max = %d", PI, max);
        // OUTPUT:
        // PI = 3.141593, max = 2
        // max = Math.max(2, 1); // Can't do it either as max is final
    }
}
