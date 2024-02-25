package org.learn.abstraction;

public class Box extends AbstractBox{
    public Box(int length, int breadth, int height) {
        super(length, breadth, height);
    }

    @Override
    String sum(int addedValues) {
        return "box"+addedValues;
    }

    public static void main(String[] args) {
        AbstractBox box = new Box(1,2,3);
        System.out.println(box.area());
        Integer i = null;
        System.out.println(box.sum(1));
    }
}
