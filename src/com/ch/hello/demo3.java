package com.ch.hello;

public class demo3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int i1 = 5-i; i1 < 5; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < 5-i; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
