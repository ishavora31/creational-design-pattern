package com.example.creationaldesignpatterns.abstract_factory;

public class HomeLoan implements Loan{

    @Override
    public void show(){
        System.out.println("This is Home Loan");
    }
}
