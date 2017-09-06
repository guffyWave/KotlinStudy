package com.guffy.kotlinstudy.core

import java.lang.Integer.parseInt

/**
 * Method calls
 * *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */
fun main(args: Array<String>) {
    var name: String = "Suresh";
    var course = "Anthropology";
    println("$name has opted for $course")

    val address: String? = null // nullable string
    println("Address is  $address")


    val num1 = "23"
    val num2 = "93"
    println("Sum is  ${Integer.parseInt(num1) + Integer.parseInt(num2)}")

   printProduct("34", "fg31")
}

fun parseMyNumber(str: String): Int? = Integer.parseInt(str)

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}