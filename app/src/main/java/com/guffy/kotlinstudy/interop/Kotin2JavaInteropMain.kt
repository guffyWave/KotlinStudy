package com.guffy.kotlinstudy.interop

import com.guffy.kotlinstudy.entity.Car
import java.util.*

/**
 *Calling Java from Kotlin
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/7/17
 */
fun main(args: Array<String>) {

    val gaddi = Car("Mercedeez Benz", "DL7463H89", 384757L)
    gaddi.run();

    //gaddi.doWork(); in Kotlin, all exceptions are unchecked !!

    demo()
}

fun demo() {
    val cartoons = ArrayList<String>()
    cartoons.add("Shinchan")
    cartoons.add("Oswald")
    cartoons.add("Spiderman")
    cartoons.add("Thomas Tank Engine")

    for (item in cartoons) {
        println(item)
    }
}