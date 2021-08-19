package com.samples

import kotlin.reflect.KProperty
import kotlin.properties.Delegates

// 该文件主要用于学习kotlin委托代理的使用

interface Base {
    val message:String

    fun printClassName()
    fun printMessage()
}

class BaseImpl() : Base {
    override val message:String = "BaseImpl"

    override fun printClassName() {
        println("Hello, BaseImpl!")
    }

    override fun printMessage() {
        println(message)
    }
}

class Derived(b: Base) : Base by b {
    override val message:String = "Derived"

    override fun printClassName() {
        println("Hello, Derived!")
    }
}

// Delegated properties﻿

// val/var <property name>: <Type> by <expression>

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

class Example {
    var p: String by Delegate() // p is a delagted properties
}

// Standard delegates

// Lazy properties: the value gets computed only upon first access.
class LazyExample {
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
}

// Observable properties: listeners get notified about changes to this property.
class ObservableExample {
    var name: String by Delegates.observable("<no name>") {
        _, old, new ->
        println("$old -> $new")
    }
}

// Storing properties in a map, instead of a separate field for each property.
class StoringExample(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

// Main函数
fun main() {
    var b = BaseImpl()
    b.printClassName()
    b.printMessage()
    println(b.message)

    var d = Derived(b)
    d.printClassName()
    d.printMessage()
    println(d.message)

    var e = Example()
    e.p = "abc"
    var s:String = e.p
    println(s)

    var le = LazyExample()
    println(le.lazyValue)
    println(le.lazyValue)

    var oe = ObservableExample()
    oe.name = "first"
    oe.name = "second"

    val se = StoringExample(mapOf(
    "name" to "John Doe",
    "age"  to 25
    ))
    println(se.name)
    println("${se.age}")
}
