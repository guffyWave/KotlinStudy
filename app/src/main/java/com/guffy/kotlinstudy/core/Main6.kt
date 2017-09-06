package com.guffy.kotlinstudy.core

/**
 * Callese Study
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */
fun main(args: Array<String>) {
    val apolloHospital: Hospital = Hospital("Apollo Hospital", "Gurgaon,Haryana")
    apolloHospital.treatPatient()

    val farhan: Person = Person("Farhan", "Khurshid", 12)

    val anim: Animal = Animal("Any animal")
    val anim2: Animal = Dog("Dog", "Poemrian")
    val kutta: Dog = Dog("Dog", "Dobberman")

    anim.eat()
    anim2.eat()
    kutta.eat()
    kutta.bark()

}

class Person constructor(val firstName: String, val lastName: String, val age: Int) {
    init {
        println("Secondary constructor called with fname ${firstName} lname ${lastName}  & age ${age} ")
    }

    constructor(firstName: String) : this(firstName, "", 0) {
        println("Secondary constructor called with name ${firstName}")
    }

    constructor(age: Int) : this("", "", age) {
        println("Ternary constructor called with age ${age}")
    }

}

class Hospital constructor(val name: String, val address: String) {
    init { //called with primary constructor
        println("Hospital initialized with value ${name}")
    }

    fun treatPatient() {
        println("${name} is treating patient ")
    }
}

class Actor constructor(name: String) {
    constructor(name: String, age: Int) : this(name) {
        //...
    }
}

open class Animal(val name: String) {
    var age: Int = 0;
    fun breath() {
        println("${name} is breathing")
    }

    open fun eat() {
        println("${name} is eating")
    }
}

class Dog(name: String, var breed: String) : Animal(name) {

    override fun eat() {
        println("${name} is eating")
    }

    fun bark() {
        println("${name} is barking bow bow...")
    }
}