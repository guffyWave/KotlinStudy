package com.guffy.kotlinstudy.core

import java.lang.Integer.parseInt

/**
 * Variable Declaration and methods
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */
@Suppress("UNUSED_PARAMETER")
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


    val max = if (a > b) {
        print("Chose a")
        a
    } else {
        print("Chose b")
        b
    }
    print("Value is $max")


    ////////////////////////////////////////////////////////////////////////
    val s: String = "12"
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3, 4 -> print("x == 4 or x == 3")
        parseInt(s) -> print("x is eq 12")
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> { // Note the block
            print("x is something else")
        }
    }
    //////////////////////////////////////////////////////////////////////
    do {
        val y = retrieve()
    } while (y != null) // y is visible here!

    /////////////Labelled Loop/////////////////////////////////////////////////////////
    anyGuffyLabel@ val anyVariable = 89;
    guffyLoop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 4) break@guffyLoop
        }
    }

    ////////////Elvis Operator////////////////////////////////////////////////////////////////////
    //val l: Int = if (b != null) b.length else -1
    val cus = Customer(1223L, "Guffy", 12);
    val l = cus?.age ?: -1
    //or

}

fun retrieve(): Any {
    return Any()
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun maxOf2(a: Int, b: Int): Int = if (a > b) a else b



