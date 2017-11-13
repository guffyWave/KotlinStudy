package com.guffy.kotlinstudy.core

open class P(x: Int) {
    public open val y: Int = x
}

interface Q {
    public fun someMethod()
}

fun test1() {
    val pq: P = object : P(1), Q {
        override fun someMethod() {
            //
        }
    }

    val runtimeObject = object {
        val x: Int = 0
        val y: Int = 0
    }
    ////////////////////////////////////////////////////////
}

class S {
    // Private function, so the return type is the anonymous object type
    private fun foo() = object {
        val x: String = "explode"
    }

    // Public function, so the return type is Any
    public fun publicFoo() = object {
        val x: String = "explode public"
    }

    fun bar() {
        val x1 = foo().x        // Works
        // val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
    }

}

///////////////////////////------Companion objects----///////////////
class MySingletonClass {
    companion object Factory {
        fun create(): MySingletonClass = MySingletonClass()
    }
}

////Just like Java's anonymous inner classes, code in object expressions can access variables from the enclosing scope. (Unlike Java, this is not restricted to final variables.)
//fun countClicks(window: JComponent) {
//    var clickCount = 0
//    var enterCount = 0
//
//    window.addMouseListener(object : MouseAdapter() {
//        override fun mouseClicked(e: MouseEvent) {
//            clickCount++
//        }
//
//        override fun mouseEntered(e: MouseEvent) {
//            enterCount++
//        }
//    })
//    // ...


//object DataProviderManager {
//    fun registerDataProvider(provider: DataProvider) {
//        // ...
//    }
//
//    val allDataProviders: Collection<DataProvider>
//        get() = {}
//}
//
//DataProviderManager.registerDataProvider(...)