package com.samples

// 该文件主要用于学习kotlin函数方法

// Function parameters are defined using Pascal notation - name: type. 
fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b
}

// Default arguments
fun read(b: List<Int>, offset: Int = 0, len: Int = b.size): String {
    var sb = StringBuffer()
    for (i in b.indices) {
        if (i >= offset) {
            sb.append(b[i].toChar())
        }
    }
    return sb.toString()
}

// Single-expression functions
fun double(x: Int): Int = x * 2

// Variable number of arguments (varargs)
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

// Extension functions
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

// Infix notation 中缀函数
// 1. They must be member functions or extension functions.
// 2. They must have a single parameter.
// 3. The parameter must not accept variable number of arguments and must have no default value.
infix fun Int.plus(x: Int): Int = this + x

// Main函数
fun main() {
    var maxVar = max(10, 9).toString()
    println(maxVar)
    maxVar = max(b = 9, a = 10).toString()
    println(maxVar)

    var b = asList(21, 33, 55, 66)
    println(read(b))
    
    println(1 plus 2)
}
