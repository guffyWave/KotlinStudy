package com.guffy.kotlinstudy.core

import com.guffy.kotlinstudy.BuildConfig

//Lambda Expression - A higher-order function is a function that takes functions as parameters, or returns a function

val f: (Unit) -> Unit = { println("Hello") }
val f2: () -> Unit = { println("Hello 2") }
fun useAbove() {
    f(Unit) // the only valid call
    f2() // valid call
}

//fun toBeSynchronized() = sharedResource.operation()
//val result = lock(lock, ::toBeSynchronized)

val sumLambda = { x: Int, y: Int -> x + y }
val sumLambda2: (Int, Int) -> Int = { x, y -> x + y }

fun simpleMethod() {
    println("Simple method")
    sumLambda
    sumLambda2(2, 6)
}

fun getNumber(): Int {
    return 786
}

fun callMethod(codeBlock: () -> Unit) {
    println("Calling up a method..")
    codeBlock
}

fun operate(numOne: Int, numTwo: Int, codeBlock: () -> Unit) {
    println("You are going to operate on $numOne and $numTwo")
}

fun useFunOperate() {
    //operate(2, 5, getNumber())
    callMethod { simpleMethod() }
    callMethod { getNumber() }
    //operate(2, 4, simpleMethod())
    //If the lambda parameter is unused, you can place an underscore instead of its name:
    //map.forEach { _, value -> println("$value!") }

    //max(strings, { a, b -> a.length < b.length })
}

fun <T> max(collection: Collection<T>, less: (T, T) -> Boolean): T? {
    var max: T? = null
    for (it in collection)
        if (max == null || less(max, it))
            max = it
    return max
}

////////////////////////second example //////////////////////////////////
inline fun debug(code: () -> Unit) {
    if (BuildConfig.BUILD_TYPE == "debug") {
        code()
    }
}

fun useFunDebug() {
    debug { add(2, 4) }
}