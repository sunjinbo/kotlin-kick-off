package com.samples

// 该文件主要用于学习kotlin内联函数的使用

// inline做的优化就是将带有函数参数的方法简化成没函数式参数的直接调用。
// 好处是提高程序的性能。

inline fun maxInt(a: Int, b: Int): Int {
    if (a > b) return a
    return b
}

inline fun inlineFuc() {
    print("inline")
}

// Main函数
fun main() {
    println(maxInt(10, 11))
    inlineFuc()
}
