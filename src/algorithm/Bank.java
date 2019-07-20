package algorithm;

import java.awt.*;
import java.util.Scanner;

public class Bank {
    static  int money=10000;
    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){

        while (true) {
            System.out.println("*************");
            System.out.println("1.查看余额");
            System.out.println("2.存钱");
            System.out.println("3.取钱");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入功能编号");
            int i=input.nextInt();
            input.nextLine();
            switch (i){
                case 1:
                    lookMoney();
                    break;
                case 2:
                    addMoney();
                    break;
                case 3:
                    minusMoney();
                    break;
                case 4:
                    accountsMoney();
                    break;
                case 5:
                    return;
                default:
            }
        }

    }
    static public void lookMoney(){
        System.out.println("您的余额为："+money);
    }
    static public void addMoney(){
        System.out.println("请输入您要存的钱数");
        int add=input.nextInt();
        input.nextLine();
        money+=add;
        System.out.println("您的余额为："+money);
    }
    static public void minusMoney(){
        System.out.println("请输入您要取的钱数");
        int minus=input.nextInt();
        input.nextLine();
        money-=minus;
        System.out.println("您的余额为："+money);
    }
    static public void accountsMoney(){
        System.out.println("请输入您转的钱数");
        int minus=input.nextInt();
        input.nextLine();
        money-=minus;
        System.out.println("转账成功!");
        System.out.println("您的余额为："+money);
    }
}
