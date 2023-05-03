package com.example.creationaldesignpatterns.singleton;

public class SingletonMainClass {

    public static void main(String args[]) {

        //Get a instance of the already created class
        SingleObject singleObject = SingleObject.getInstance();

        System.out.println(singleObject);

        //Created class using new keyword
        System.out.println(new SingleObject());

        //Get a instance of the already created class
        SingleObject singleObject2 = SingleObject.getInstance();

        System.out.println(singleObject2);

        //From the result you can see that object of 1st and 3rd would be the same
        // as it is the same object.
    }
}
