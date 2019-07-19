package com.ch.hello;

abstract  class A{
    public A(){
        System.out.println("*****A*****");
    }
    abstract void print(String str);
}
class B extends A{
    public B(){
        System.out.println("*****B*****");
    }

    @Override
    void print(String str) {
        System.out.println(str);
    }
}
public class abstactTest {
    public static void main(String[] args) {
        A a=new B();
        a.print("woadadkao");
    }
}
