package com.guffy.kotlinstudy.core

/**
 * Try Catch block
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */
fun main(args: Array<String>) {

    try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }

    var sum: Int = 0;
    sum = try {
        addNum("45ss", "94")
    } catch (e: ArithmeticException) {
        -1
        //throw IllegalStateException("")
    }
    println("Sum is ${sum}")


//    val s = person.name ?: fail("Name required")
//    println(s)
}

fun myMethod(message: String): ArithmeticException {
    throw ArithmeticException("Blah blah")
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun addNum(a: String?, b: String?): Int {
    return Integer.parseInt(a) + Integer.parseInt(b);
}