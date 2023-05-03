package com.example.creationaldesignpatterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryMainClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("------Getting the car using FACTORY design pattern------");
        CarFactory carFactory = new CarFactory();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String carName = bufferedReader.readLine();
        Car car = carFactory.getCar(carName);
        if (car != null) {
            car.show();
        } else
            throw new ClassNotFoundException("Car not found");
    }
}