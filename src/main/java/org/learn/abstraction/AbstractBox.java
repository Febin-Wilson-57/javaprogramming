package org.learn.abstraction;

public abstract class AbstractBox {

    private final int length,breadth,height;

    public AbstractBox(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    Integer area(){
        return length*breadth*height;
    }
    String sum(int addedValues){
        return "error"+addedValues;
    }
//    Integer sum(Integer addedValues){
//        return addedValues==null?99:77;
//    }
}
