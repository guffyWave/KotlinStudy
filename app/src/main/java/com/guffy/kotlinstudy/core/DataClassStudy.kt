package com.guffy.kotlinstudy.core

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 11/7/17
 */
data class User(val name: String = "", val age: Int = 0)

fun myFun() {
    val u = User("Gufran", 67)

    //use of copy function
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)

    ///Pair & Triple class
    val jodiOne = Pair<String, String>("Santa", "Banta")


    ///Destructing Functions
    val jane = User("Jane", 35)
    val (name, age) = jane
    println("$name, $age years of age")
}