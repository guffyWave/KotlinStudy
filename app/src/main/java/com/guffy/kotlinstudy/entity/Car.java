package com.guffy.kotlinstudy.entity;

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/7/17
 */

public class Car {
    String modelName;
    String carNumber;
    long engineNumber;

    public Car(String modelName, String carNumber, long engineNumber) {
        this.modelName = modelName;
        this.carNumber = carNumber;
        this.engineNumber = engineNumber;
    }

    public void run() {
        System.out.println(modelName + " is running");
    }

    public void doWork() throws Exception {
        throw new Exception("Can't Work. I am in maintenance phase");
    }

}
