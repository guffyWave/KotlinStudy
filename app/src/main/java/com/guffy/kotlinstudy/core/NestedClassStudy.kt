package com.guffy.kotlinstudy.core

class Car {
    var carNumber: String = ""
    lateinit var engine: Engine

    class Engine {
        var engineNumber: String = ""
    }
}

fun anyWork() {
    val eng: Car.Engine = Car.Engine()


}