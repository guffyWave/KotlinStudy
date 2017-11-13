package com.guffy.kotlinstudy.core

class Car {
    var carNumber: String = ""
    lateinit var engine: Engine

    class Engine {
        var engineNumber: String = ""
    }
}

abstract class Machine {
    abstract fun operate()
}


fun anyWork() {
    val eng: Car.Engine = Car.Engine()

    val mc: Machine = object : Machine() {
        override fun operate() {
            // code in  here
        }
    }
}