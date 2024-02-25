package org.learn.functional.multipleInheritance;

public class MultipleInheritanceExampleClass implements InterfaceA,InterfaceB,InterfaceC {

    public static void main(String[] args) {
        MultipleInheritanceExampleClass multipleInheritanceExampleClass= new MultipleInheritanceExampleClass();
        multipleInheritanceExampleClass.sumA(4,8);
        multipleInheritanceExampleClass.sumB(2,4);
        multipleInheritanceExampleClass.sumC(1,2);



    }

   public void sumA(int num1,int num2){
        System.out.println("MultipleInheritanceExampleClass sumA"+(num1+num2));
        return;
    }
}
