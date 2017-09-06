package com.guffy.kotlinstudy.core

/**
 * Collections ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */
fun main(args: Array<String>) {

    val fruits: List<String> = listOf("Apple", "Banana", "Kiwi")
    //fruits.add NOT WORK
    val anotherFruits: MutableList<String> = mutableListOf("Apple", "Banana", "Kiwi")
    anotherFruits.add("Papaya")

    for (item in fruits) {
        println(item)
    }
    println("---------------For with index----------------")
    for (index in fruits.indices) {
        println("fruit at index ${index} is ${fruits[index]}")
    }

    println("-------------While------------------")
    var i = 0;
    while (i < fruits.size) {
        println("fruit at index ${i} is ${fruits[i]}")
        i++
    }

    println("Describe 1 ${describe(1)}")
    println("Describe 789543958L ${describe(789543958L)}")
    println("Describe 'Apple' ${describe("Apple")}")
    println("Describe false ${describe(false)}")

    println("-------------in operator------------------")
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("${x} fits in range 1 to ${y + 1}")
    }

    for (x in 1..5) {
        println(x)
    }
    println("----")
    for (x in 1..10 step 2) {
        print(x)
    }
    println("----")
    for (x in 9..0 step 3) {
        print(x)
    }
    println("----")
    for (x in 10 downTo 0 step 2) {
        println(x)
    }

//    for (i in 1..100) { ... }  // closed range: includes 100
//    for (i in 1 until 100) { ... } // half-open range: does not include 100
//    for (x in 2..10 step 2) { ... }
//    for (x in 10 downTo 1) { ... }
//    if (x in 1..10) { ... }


    if ("Apple" in fruits)
        println("Apple present in fruits array")
    if ("Rat" !in fruits)
        println("Rat NOT present in fruits array")


}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "You entered integer one"
            is Long -> "Long"
            is String -> "Is a string"
            !is String -> "Not a string"
            else -> "Unknown"
        }