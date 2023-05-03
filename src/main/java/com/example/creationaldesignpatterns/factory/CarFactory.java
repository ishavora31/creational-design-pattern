package com.example.creationaldesignpatterns.factory;

public class CarFactory {

    public Car getCar(String carName) {
        if (carName == null) {
            return null;
        } else if (carName.equalsIgnoreCase("honda")) {
            return new Honda();
        }
        else if (carName.equalsIgnoreCase("mahindra")) {
            return new Mahindra();
        }
        else if (carName.equalsIgnoreCase("hyundai")) {
            return new Hyundai();
        }
        return null;
    }
}
