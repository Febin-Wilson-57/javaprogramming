package org.learn.abstraction;

public class ForAbstraction extends AbstractClass{

//    @Override
//    public void m2() {
//        System.out.println("hello m2");
//    }

    @Override
    public void m3() {
        System.out.println("hello m3");
    }

    @Override
    public String m1() {
        return "";
    }

    public static void main(String[] args) {
        new ForAbstraction().m2();
        new ForAbstraction().tester();
    }
}
