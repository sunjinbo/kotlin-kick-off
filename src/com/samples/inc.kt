package com.samples

// 该文件主要用于学习kotlin接口的使用

// 接口定义
interface Inc1 {
    fun foo()
    fun both()
}

interface Inc2 {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun bar() {
        // optional body
        println(propertyWithImplementation)
    }

    fun both()
}

class MyClazz : Inc1, Inc2 {
    override val prop: Int = 29

    override fun foo() {
        println("MyClazz.foo()")
    }

    override fun bar() {
        println("MyClazz.bar()")
    }

    override fun both() {
        println("MyClazz.both()")
    }
}

// Main函数
fun main() {
    var inc1:Inc1 = MyClazz()
    inc1.foo()
    // inc1.bar() // compiler error, Inc1 doesn't have function bar()
    inc1.both()
    var inc2:Inc2 = MyClazz()
    // inc2.foo() // compiler error, Inc1 doesn't have function foo()
    inc2.bar()
    inc2.both()
}
