package org.learn.constructor;

public class CallingBox {

    {
        System.out.println("init");
    }
    CallingBox()
    {
        System.out.println("default");
    }
    CallingBox(int x)
    {
        System.out.println(x);
    }

    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }

    public static void main(String[] args) {
//        Box boxv= new Box();
        new CallingBox();
        new CallingBox(10);
        Box  box = new Box(0,null);
        System.out.println(box);
    }
}
