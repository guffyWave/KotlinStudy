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

    val b: Byte = 45;
    val i: Int = 23;
    val s: Short = 89;
    val l: Long = 638423643647327646L;
    val f: Float = 3.68692317f;
    val d: Double = 3.6;


    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


    val a: Int = 1000
    print(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA === anotherBoxedA) // !!!Prints 'false'!!!


    // Hypothetical code, does not actually compile:
//    val a: Int? = 1 // A boxed Int (java.lang.Integer)
//    val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
//    print(a == b) // Surprise! This prints "false" as Long's equals() check for other part to be Long as well


    val base = Base();
    base.userAge.toInt()

    val someData = double(67)

    Hospital("Max Hospital", "Shalimar Bagh").treatPatient()

}

fun add(a: Int, b: Int): Int {
    return a + b;
}

fun sum(m: Int, n: Int) = m + n

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

