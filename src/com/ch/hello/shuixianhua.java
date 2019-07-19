package com.ch.hello;

public class shuixianhua {
    public static void main(String[] args) {
        String number="";
        int a=0,b=0,c=0;
        for (int i = 100; i <1000; i++) {
             a=i/100;
             b=(i%100)/10;
             c=i%10;
             if(i==(Math.pow(a,3))+(Math.pow(b,3))+(Math.pow(c,3))){
                 System.out.println(i);
             }
        }
    }
}
