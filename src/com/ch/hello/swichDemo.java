package com.ch.hello;

import java.util.Random;

public class swichDemo {
    public static void main(String[] args) {
        Random x=new Random();
        int[] a =new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=x.nextInt(100);
            System.out.println(a[i]);
        }
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(svg(a));

    }
    public static int max(int[] A){
       int max=A[0];
        for (int i = 0; i < A.length; i++) {
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
    public static int min(int[] A){
        int min=A[0];
        for (int i = 0; i < A.length; i++) {
            if(A[i]<min){
                min=A[i];
            }
        }
        return min;
    }
    public static double svg(int[] A){
        double sum=0;
        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
        }
        double svg=sum/A.length;
        return svg;
    }
}
