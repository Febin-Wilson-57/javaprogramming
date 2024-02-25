package org.learn.abstraction;

public abstract class AbstractClass implements Test{

    private String name;
    private Integer age;

    public AbstractClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public AbstractClass() {
    }
}
