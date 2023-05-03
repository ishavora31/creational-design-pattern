package com.example.creationaldesignpatterns.abstract_factory;

public class ICICI implements Bank{

    @Override
    public void show(){
        System.out.println("This is ICICI Bank");
    }
}
