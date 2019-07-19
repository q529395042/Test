package com.ch.hello;

interface C{

        abstract void get();
}
interface D{
    abstract void print();
}
class crue implements C,D{
    @Override
    public void get() {
        System.out.println("获得c");
    }

    @Override
    public void print() {
        System.out.println("打印D");
    }
}
public class implmentTest {
    public final int SDG=10;
    public static void main(String[] args) {
        crue x=new crue();
        C a=x;
        D d=x;
        a.get();
        d.print();
    }
}
