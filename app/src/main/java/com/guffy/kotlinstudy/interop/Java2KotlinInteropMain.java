package com.guffy.kotlinstudy.interop;

import com.guffy.kotlinstudy.core.Dog;
import com.guffy.kotlinstudy.core.Main2Kt;

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/7/17
 */

public class Java2KotlinInteropMain {
    public static void main(String[] args) {

        //calling class
        Dog dog = new Dog("Abhilash", "Pomerian");
        System.out.println("Dog name " + dog.getName());
        System.out.println("Dog breed " + dog.getBreed());
        dog.eat();
        dog.breath();

        //calling static methods
        int result = Main2Kt.maxOf2(23, 78);
        System.out.println("Max is " + result);


    }
}
