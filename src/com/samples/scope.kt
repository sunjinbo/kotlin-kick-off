package com.samples

import kotlin.text.toIntOrNull

// 该文件主要用于学习kotlin的Scope Functions

// let
val empty = "empty".let {
    println(it)
    it.isEmpty()
}

fun printLetNoneNull(str: String?) {
    str?.let {
        print(it)
        println()
    }
}

// run

// run和let非常类似，唯一区别是内部访问对象是通过this，而不是it

// This is useful when you want to call the object's methods 
// rather than pass it as an argument.
fun printRunNoneNull(str: String?) {
    str?.run {
        println(this)
        println(length)
    }
}

data class RunClazz(var name: String, var age: Int)

fun getNullableRunClazz(rc: RunClazz?) {
    rc?.run {
        println(this)
        println(name)
        println(age)
    }
}

// with
class WithClazz() {
    var name: String = ""
    var age: Int = 0
    var color: Int = 0
}

fun getWithClazz(n: String, a: Int, c: Int): WithClazz {
    var clz = WithClazz()
    with (clz) {
        name = n
        age = a
        color = c
    }
    return clz
}

// apply

class ApplyClazz() {
    var name: String = ""
    var age: Int = 0
    var color: Int = 0
}

// apply executes a block of code on an object 
// and returns the object itself. 

fun getApplyClazz(n: String, a: Int, c: Int): ApplyClazz {
    var clz = ApplyClazz()
    return clz.apply { // This function is handy for initializing objects.
        name = n
        age = a
        color = c
     }
}

// also
// also works like apply
// but Inside the block, the object is referenced by it

// This function is handy for embedding additional actions, 
// such as logging in call chains.
data class AlsoClazz(var name: String, var age: Int)

fun getAlsoClazz(n: String, a: Int): AlsoClazz {
    var clz = AlsoClazz(n, a)
        .also { 
            println(it)
         }
    return clz
}

// Main函数
fun main() {
    // let
    printLetNoneNull("$empty")
    printRunNoneNull("$empty")

    // run
    var rc = RunClazz("Tom", 10)
    getNullableRunClazz(rc)
    getNullableRunClazz(null)

    // with
    var clz0 = WithClazz()
    println(clz0)
    println(getWithClazz("James", 12, 34))

    // apply
    var clz1 = ApplyClazz()
    println(clz1)
    println(getApplyClazz("Amy", 8, 394))

    // also
    getAlsoClazz("Andy", 5)
}
