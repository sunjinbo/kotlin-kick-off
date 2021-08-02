package com.samples

// 该文件主要用于学习kotlin异常处理

// Main函数
fun main() {
    try {
        // some code
        var a = 0
        var b = 10
        var c = b / a
        println("$b ÷ $a = $c")
    } catch (e: Exception) {
        // handler
        println(e.message)
    } finally {
        // optional finally block
        println("This program is over.")
    }
}
