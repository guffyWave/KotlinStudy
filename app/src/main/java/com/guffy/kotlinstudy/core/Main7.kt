package com.guffy.kotlinstudy.core

/**
 * Handling null
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 9/6/17
 */

fun main(args: Array<String>) {
    //Dog cannot support null but Dog? can
    var dog: Dog? = null;
    // dog = Dog("Stiffler", "Dobberman")
    dog?.age = 10;

    //   printDogName(dog)

//    dog?.breath()
//    dog?.eat()
//    dog?.bark();
//    println("Dog name is ${dog?.name}")
//
//    dog?.let {
//        // execute this block only if dog is not null
//        dog?.breath()
//        dog?.eat()
//        dog?.bark();
//        println("Dog name is ${dog?.name}")
//    }
    val dogColor = dog?.let { transform(dog?.age) } ?: "Nothing"
    println("Dog color ${dogColor}")
}

fun transform(age: Int?): String {
    return when (age) {
        10 -> "Red"
        20 -> "Green"
        30 -> "Blue"
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

fun printDogName(dog: Dog?) {
    println("Dog breed is ${dog?.breed ?: "empty"}")//beauty !! doesnot throw NPE
}
