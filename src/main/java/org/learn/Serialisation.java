package org.learn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.*;

public class Serialisation {

    void serialisations() throws IOException {
        Employee employee =new Employee();
        employee.setId(1);
        employee.setName("weee");
        employee.setCompanyName("geeee");
        employee.setSalary(12344.0);
        employee.setSalaryVar(employee.getSalary());
        FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        System.out.println("serialisation completed");
    }

    void deSerialisation() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream  =new FileInputStream("xyz.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee employee = (Employee) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("deserialisation completed");
        System.out.println(employee);

    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialisation serialisation = new Serialisation();
        serialisation.serialisations();
        serialisation.deSerialisation();
    }



//    @Data
//    @ToString
//    @AllArgsConstructor
//    @NoArgsConstructor
    public  static class Employee implements Serializable{

//        @Serial
        private static final long serialVersionUID = 4828816765837254083L;
        private int id;
        private String name;
        private String companyName;
        private String address;
        private transient double salary;
        private double salaryVar;

    public Employee(int id, String name, String companyName, String address, double salary, double salaryVar) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.address = address;
        this.salary = salary;
        this.salaryVar = salaryVar;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryVar() {
        return salaryVar;
    }

    public void setSalaryVar(double salaryVar) {
        this.salaryVar = salaryVar;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", salaryVar=" + salaryVar +
                '}';
    }
}

}

