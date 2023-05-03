package com.example.creationaldesignpatterns.abstract_factory;

public class BankFactory implements AbstractFactory{


    @Override
    public Bank getBank(String bankName) {
        if(bankName == null)
            return null;
        else if (bankName.equalsIgnoreCase("SBI"))
            return new SBI();
        else if (bankName.equalsIgnoreCase("HDFC"))
            return new HDFC();
        else if (bankName.equalsIgnoreCase("ICICI"))
            return new ICICI();
        return null;
    }

    @Override
    public Loan getLoan(String loanName) {
        return null;
    }
}
