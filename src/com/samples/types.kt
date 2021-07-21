package com.samples

// 该文件主要用于学习kotlin基本数据类型和类型检测

// Basic types https://kotlinlang.org/docs/basic-types.html

// Type checks and casts https://kotlinlang.org/docs/typecasts.html

// Main函数
fun main(args: Array<String>) {
    /* numbers */

    // Integer types
    val byteVal: Byte = 2 // 8bit
    val shortVal: Short = 3 // 16bit
    val integerVal: Int = 4 // 32bit
    val longVal: Long = 6L // 64bit

    println(byteVal)
    println(shortVal)
    println(integerVal)
    println(longVal)

    // Floating-point types
    val floatVal: Float = 2.4F // 32bit
    val doubleVal: Double = 3.14 // 64bit

    println(floatVal)
    println(doubleVal)

    // Note that unlike some other languages, 
    // there are no implicit widening conversions for numbers in Kotlin. 
    // printDouble(floatVal) // Error: Type mismatch

    // Literal constants
    println(123) // Decimals
    println(123L) // Longs are tagged by a capital L
    println(0x0F) // Hexadecimals
    println(0b00001011) // Binaries
    println(123.5e10) // floating-point numbers
    println(123.4F) // Floats are tagged by f or F

    // Note that kotlin are not supported for Octal literals now.

    // You can use underscores to make number constants more readable
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

    /* booleans */
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
    println(boolNull)
    
    /* characters */
    val charVal: Char = 'y'
    println(charVal)
    println('\n') //prints an extra newline character
    println('\uFF00')
    
    /* strings */
    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"
    
    /* arrays */

    val arrVal = arrayOf(2, 3, 4)
    arrVal.forEach { println(it) }

    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    // Primitive type arrays﻿
    var x: IntArray = intArrayOf(1, 2, 3) // [1, 2, 3]
    x.forEach { println(it) }

    x = intArrayOf(5)  // [0, 0, 0, 0, 0]
    x.forEach { println(it) }

    /* Type checks and casts */

    // is and !is operators
    var stringVal = "hi"
    if (stringVal is String) {
        println(stringVal)
    }

    // "Unsafe" cast operator
    val unsafeVal: Int = 4
    var unsfaeStringVal = unsafeVal as String

    // "Safe" (nullable) cast operator
    //unsfaeStringVal = unsafeVal as? String

    // END
}
