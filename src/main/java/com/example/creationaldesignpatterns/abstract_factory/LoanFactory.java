package com.example.creationaldesignpatterns.abstract_factory;

public class LoanFactory implements AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanName) {
        if(loanName == null)
            return null;
        else if (loanName.equalsIgnoreCase("home"))
            return new HomeLoan();
        else if (loanName.equalsIgnoreCase("personal"))
            return new PersonalLoan();
        return null;
    }
}
