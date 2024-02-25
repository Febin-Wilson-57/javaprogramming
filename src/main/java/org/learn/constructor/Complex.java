package org.learn.constructor;

import java.util.Objects;

public class Complex {

    // Class data members
    private double re, im;

    // Constructor 1
    // Parameterized constructor
    public Complex(double re, double im)
    {

        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }

    // Constructor 2
    // Copy constructor
    Complex(Complex c)
    {

        System.out.println("Copy constructor called");

        re = c.re;
        im = c.im;
    }
     String test(){
        return "";
    }

    // Overriding the toString() of Object class
    @Override public String toString()
    {

        return "(" + re + " + " + im + "i)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(re, complex.re) == 0 && Double.compare(im, complex.im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }


    public static void main(String[] args) {
        // Creating object of above class
        Complex c1 = new Complex(10, 15);

        // Following involves a copy constructor call
        Complex c2 = new Complex(c1);

        // Note: Following doesn't involve a copy
        // constructor call
        // as non-primitive variables are just references.
        Complex c3 = c2;

        // toString() of c2 is called here
        System.out.println(c2);
        System.out.println(c3==c2);
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
    }
}
