package com.ch.hello;

public class febonaqie {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c=0;
        for(int i=0;i<50;i++){
            if(b<1000) {
                System.out.println(b);
                c = a + b;
                a = b;
                b = c;

            }
        }
    }
}
