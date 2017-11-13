package com.guffy.kotlinstudy.core

fun double(x: Int): Int {
    return 2 * x
}

//default arguments
fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {
}

//Named Arguments
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
    //.......
}

fun myWork() {
    //normal call
    reformat("str", true, true, false, '_')

    //named call
    reformat(str = "STR",
            normalizeCase = true,
            upperCaseFirstLetter = true,
            divideByCamelHumps = false,
            wordSeparator = '_'
    )

    //and if we do not need all arguments:
    reformat(str = "STR", wordSeparator = '_')

    myVarArgMethod(strings = *arrayOf("a", "b", "c"))
    myVarArgMethod(strings = "a")
}

fun myVarArgMethod(vararg strings: String) {
    //...
}

//Unit-returning functions
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}

//Single-Expression functions
fun doubleIt(x: Int): Int = x * 2


