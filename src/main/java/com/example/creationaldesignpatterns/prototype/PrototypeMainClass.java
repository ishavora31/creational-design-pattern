package com.example.creationaldesignpatterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrototypeMainClass {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<String> arraylist = new ArrayList<>();
        arraylist.add("MA");
        arraylist.add("BA");
        Employee e1 = new Employee("Isha", "Developer", 40000, arraylist);
        Employee e2 = (Employee) e1.clone();
        arraylist.add("BE");
        System.out.println(e1);
        System.out.println(e2);
    }
}
