package com.ch.hello;

import java.io.OutputStream;

public class demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 5-i; i1++) {
                System.out.print(" ");
            }
            for (int j = 5-i; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
