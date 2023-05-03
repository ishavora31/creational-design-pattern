package com.example.creationaldesignpatterns.abstract_factory;

public class PersonalLoan implements Loan {
    @Override
    public void show(){
        System.out.println("This is Personal Loan");
    }
}
