package com.ch.hello;

public class demo4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 <=5-i; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 5; i1 > 5-i-1; i1--) {
                System.out.print("*");
            }
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {

            for (int j = -2; j <=4-i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<2*(i-1)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
