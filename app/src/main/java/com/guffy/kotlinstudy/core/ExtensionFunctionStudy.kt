package com.guffy.kotlinstudy.core

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 11/7/17
 */

/////extend a class with new functionality without having to inherit from the class

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun work() {
    val l = mutableListOf(1, 2, 3)
    l.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'l'
}

////example ///////////////////////////////////////////////

open class X

class Y : X()

fun X.foo() = "c"

fun Y.foo() = "d"

fun printFoo(x: X) {
    println(x.foo())
}

//printFoo(Y())

///Member always wins////////////////////////////////////////////////

class M {
    fun foo() {
        println("member")
    }
}

fun M.foo() {
    println("extension")
}

//if we call m.foo() , 'member will be called


///////////////////////////////////////////////////////

fun Any?.toString(): String {
    if (this == null) return "null"
    // after the null check, 'this' is autocast to a non-null type, so the toString() below
    // resolves to the member function of the Any class
    return toString()
}

////////////Extension Properties///////////////////////////////////////////

val <T> List<T>.lastIndex: Int
    get() = size - 1


//val Foo.bar = 1 // error: initializers are not allowed for extension properties


////////Extension for companion object/////////////////////////////////////////////
class MyClass {
    companion object {}  // will be called "Companion"
}

fun MyClass.Companion.foo() {
    //....
}