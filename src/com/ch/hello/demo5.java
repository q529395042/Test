package com.ch.hello;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入头的个数");
        int head=input.nextInt();
        System.out.println("请输入脚的个数");
        int foot=input.nextInt();
        int x=foot-2*head;
        int roobt=x/2;
        int ji=head-roobt;
        if(head==ji+roobt&&foot==ji*2+roobt*4){
        System.out.println("鸡的个数有:"+ji+"兔子的个数有:"+roobt);
        }else{
            System.out.println("输入错误!!!");
        }
    }
}
