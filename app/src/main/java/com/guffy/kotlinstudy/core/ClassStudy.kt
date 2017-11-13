package com.guffy.kotlinstudy.core

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 11/6/17
 */
class Invoice {}

class Empty

class Employee constructor(firstName: String) {
}

class Employee2(firstName: String) {
}
//class Customer public @Inject constructor(name: String) { ... }

class DontCreateMe private constructor() {
}

class Customer2(val customerName: String = "")

class Example // Implicitly inherits from Any
//Any is not java.lang.Object; in particular, it does not have any members other than equals(), hashCode() and toString()


class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

open class Base {
    open var userAge: Int = 0
        get() = 5

    open fun v() {}
    fun nv() {}
//    fun getUserAge():Int{
//        return userAge;
//    }
}

class Derived() : Base() {
    override var userAge: Int = 0
        get() = super.userAge

    override fun v() {}
}

interface Foo {
    val count: Int
}

class Bar1(override val count: Int) : Foo {
}

open class MySuper {
    open val x: Int get() = 1
    open fun f() {}
}

class Bar2 : MySuper() {
    override val x: Int get() = super.x + 1
}

class Bar3 : MySuper() {
    override fun f() {
    }

    override val x: Int get() = 0

    inner class Baz {
        fun g() {
            super@Bar3.f() // Calls MySuper's implementation of f()
            println(super@Bar3.x) // Uses MySuper's implementation of x's getter
        }
    }
}

class Address {
    var name: String = ""
    var street: String = ""
    var city: String = ""
    var state: String? = ""
    var zip: String = ""
}

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    return result
}


class GetterSetterEntity {
    private var fname: String = ""
        get() = field  // field is actually this.fname, and 'this' is your class/obj instance
        set(value) {
            field = value
        }
    var name: String = "No Name"
        get() = "Mr. " + field
        set(value) {
            field = value.trim()
        }
    var age: Int = -1
    private var _table: Map<String, Int>? = null
        get() {
            if (_table == null) {
                _table = HashMap() // Type parameters are inferred
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }
}


public class MyTest {
    lateinit var address: Address

    fun setup() {
        address = Address()
    }
}


