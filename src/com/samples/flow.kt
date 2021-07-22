package com.samples

// 该文件主要用于学习kotlin的控制流

// Main函数
fun main() {
    /* If expression */
    var a:Int = 10
    var b:Int = 11
    var max = a
    if (a < b) max = b
    println(max)

    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println(max)

    // As expression
    max = if (a > b) a else b
    println(max)

    /* When expression */
    when (max) {
        0, 1 -> print("max = 0 or max = 1")
        in 2..9 -> print("max is in the range of 2 to 9")
        10 -> print("max = 10")
        11 -> print("max = 11")
        !in 12..20 -> print("max is outside the range")
        else -> { // Note the block
            print("none of the above")
        }
    }

    when {
        a == 10 -> print("a is ten")
        b == 11 -> print("b is eleven")
        else -> print("unknown")
    }

    /* For loops */
    var arrayVar = arrayOf(1, 2, 3, 4, 5)
    for (value in arrayVar) {
        print(value)
    }

    for (index in arrayVar.indices) {
        println(arrayVar[index])
    }

    for ((index, value) in arrayVar.withIndex()) {
        println("the element at $index is $value")
    }

    for (i in 1..3) {
        print(i)
    }

    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    /* While and Do-while loops */
    while (b > 0) {
        b--
    }

    do {
        a -= 1;
    } while (a > 0)

    /* Break and continue in loops */
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i * j > 100) {
                break @loop
            } else {
                continue
            }
        }
    }
}
