package org.learn.constructor;

public class Box {

    private int id;
    private String name;

   private Box() {

    }
    public Box(Integer id,String name){
       this.id =id;
       this.name=name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
