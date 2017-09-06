package com.guffy.kotlinstudy.core

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */
fun main(args: Array<String>) {
    //Assign-once (read-only) local variable
    val a: Int = 10
    val b = 20
    val c: Int
    c = 30

    //mutable variable
    var x: Int = 28
    var y = 4
    y = y + 1
    y += 3

    val s1 = "x is $x"
    x = 67
    val s2 = "${s1.replace("is", "was")}, but now is $x"

    println(s1)
    println(s2)

    val res = maxOf(45, 78)
    println("Max out of 45 & 78 is $res")
    println("Max out of 45 & 78 is ${maxOf(45, 78)}")

}

fun maxOf(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun maxOf2(a: Int, b: Int): Int = if (a > b) a else b



