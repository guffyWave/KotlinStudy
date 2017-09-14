package com.guffy.kotlinstudy.core

/**
 * Hello Kotlin
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */
fun main(args: Array<String>) {
    println("Hello Kotlin")
    println("Sum is " + add(2, 3))
    oddEven(5)

    println("Length is of text ${getStringLength("This is a very long message.Now get lost !")}")
    println("Length is of number ${getStringLength(7572)}")

}

fun add(a: Int, b: Int): Int {
    return a + b;
}

fun oddEven(n: Int) {
    if (n % 2 == 0)
        println("$n is Even")
    else
        println("$n is Odd")
}

//use of instance operator
fun getStringLength(obj: Any): Int {
    if (obj is String)
        return obj.length
    else
        return -1;
}

fun getStringLength2(obj: Any): Int = if (obj is String) obj.length else -1

