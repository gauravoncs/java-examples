package com.csr.examples.java.boxing;

public class Boxing1 {
    public static void main(String[] args) {
        // primitive literal boolean to wrapper Boolean class
        Boolean b1 = false, b2 = !b1; // boxing

        // char -> Character
        Character c1 = 'j'; // boxing

        // int -> Integer
        Integer i1 = 10; // boxing

        // double -> Double
        Double d1 = 1.61803399; // boxing

        // for format specifier: % [flags] [width] [.precision] [argsize] typechar
        System.out.printf("b1: %b, b2: %B, c1: %c, i1: %d, d1: %.8f", b1, b2, c1, i1, d1);
        // OUTPUT: b1: false, b2: TRUE, c1: j, i1: 10, d1: 1.61803399
    }
}