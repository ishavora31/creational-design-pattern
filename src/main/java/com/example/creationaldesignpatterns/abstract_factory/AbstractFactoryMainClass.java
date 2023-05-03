package com.example.creationaldesignpatterns.abstract_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryMainClass {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        System.out.println("------Getting the Bank and Loan using ABSTRACT FACTORY design pattern------");
        System.out.println("Enter Bank Name");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String bankName = bufferedReader.readLine();
        Bank bank = AbstractFactoryCreator.getFactory("bank").getBank(bankName);
        if (bank !=null){
            bank.show();
        } else
            throw new ClassNotFoundException("Bank not found");
        System.out.println("Enter Loan Name");
        String loanName = bufferedReader.readLine();
        Loan loan = AbstractFactoryCreator.getFactory("loan").getLoan(loanName);
        if (loan !=null){
            loan.show();
        } else
            throw new ClassNotFoundException("loan not found");
    }
}
