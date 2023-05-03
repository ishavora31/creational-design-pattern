package com.example.creationaldesignpatterns.abstract_factory;

public interface AbstractFactory {

    Bank getBank(String bankName);
    Loan getLoan(String loanName);
}
