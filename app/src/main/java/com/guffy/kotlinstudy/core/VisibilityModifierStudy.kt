package com.guffy.kotlinstudy.core

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 11/7/17
 */

private fun foo() {} // visible inside example.kt

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in example.kt

internal val baz = 6    // visible inside the same module

/*
* If you do not specify any visibility modifier, public is used by default, which means that your declarations will be visible everywhere;
If you mark a declaration private, it will only be visible inside the file containing the declaration;
If you mark it internal, it is visible everywhere in the same module;
protected is not available for top-level declarations.
* */


/////////////For Classes and Interfaces///////////////////////////////////////////////////////////
//For members declared inside a class:
//private means visible inside this class only (including all its members);
//protected — same as private + visible in subclasses too;
//internal — any client inside this module who sees the declaring class sees its internal members;
//public — any client who sees the declaring class sees its public members.
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}