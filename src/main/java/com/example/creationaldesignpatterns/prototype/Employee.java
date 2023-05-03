package com.example.creationaldesignpatterns.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Employee implements Cloneable{

    private String name;
    private String designation;
    private double salary;
    private List<String> degrees = new ArrayList<>();


    public Employee(String name, String designation, double salary, List<String> degrees) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.degrees = degrees;
    }

    public Employee(){

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", degrees=" + degrees +
                '}';
    }

    //Below clone method can be used for shallow cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //For deep cloning use below clone method
    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee e = new Employee();
        e.setDesignation(this.getDesignation());
        e.setSalary(this.getSalary());
        e.setName(this.getName());
        for(String degree: this.getDegrees()){
            e.getDegrees().add(degree);
        }
        return e;
    }
}
