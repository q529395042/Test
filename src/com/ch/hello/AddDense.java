package com.ch.hello;

import java.util.Arrays;
import java.util.Scanner;

public class AddDense {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您要加密的数字");
        int sum =input.nextInt();
        int[] a=new int[4];
        for (int i = 0; i <a.length; i++) {
            a[3-i]=(sum%10+5)%10;
            System.out.println(i+"  :"+a[i]);
            sum/=10;
        }
        a=swap(a,0,3);
        a=swap(a,1,2);
        System.out.println(Arrays.toString(a));
    }
    public static int[] swap(int[] a,int x,int y){
        int temp=0;
        temp=a[x];
        a[x]=a[y];
        a[y]=temp;
        return a;
    }
}
