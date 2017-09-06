package com.guffy.kotlinstudy.core

import java.io.File

/**
 * Collections Map
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */
fun main(args: Array<String>) {
    val actors = listOf("De Caprio", "Matt Deamon", "Heath Leadger", "Kate Winslet", "Tom Hanks")

    for (a in actors) {
        println(a)
    }

    when {
        "Shahrukh" in actors -> println("Shahrukh is in actor")
        "De Caprio" in actors -> println("De Caprio is in actor")
    }


    //Map
    var myMap = mapOf(Pair(1, "One"), Pair(2, "Two"))
    var mutableMap: MutableMap<String, String> = mutableMapOf();
    mutableMap.put("abc", "ABC")

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((k, v) in myMap) {
        println("$k -> $v")
    }
    println(map["z"])

    //// iterate the files  -- f not null and else shorthand
    val files = File("Test").listFiles()
    println(files?.size)
    println(files?.size ?: "empty")


    //lazy property
    val p: String by lazy {
        println("p lazily initialized")
        "Hello"
    }
    println("Value of p is  ${p}")


    val msg = "Message is to tell good work"
    println("Calling spaceToCamel ${msg.spaceToCamelCase()}")

}

//default vaue of method params
fun foo(a: Int = 0, b: String = "") {
    //...
}

//Extension Functions -newly method added  in String
fun String.spaceToCamelCase() {
    println("called spaceToCamelCase")
}
