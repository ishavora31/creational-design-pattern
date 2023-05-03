package com.example.creationaldesignpatterns.singleton;

public class SingleObject {

    public static SingleObject instance = new SingleObject();

    //while creating singleton class constructor should be private as not object creation using new keyword should be done
    //but for the demonstration purpose below constructor kept public
    public SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from the SingleObject!");
    }
}
