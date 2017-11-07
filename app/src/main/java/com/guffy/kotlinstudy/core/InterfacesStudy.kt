package com.guffy.kotlinstudy.core

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 11/7/17
 */
interface MyInterface {
    fun bar()
    val prop: Int// abstract
    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override val prop: Int
        get() = 67

    override fun bar() {
        // body
    }
}

////////////////////////////////////////////////////
interface A {
    fun foo() {
        print("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("bar")
    }
}

class C : A {
    override fun bar() {
        print("bar")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super.bar()
    }
}