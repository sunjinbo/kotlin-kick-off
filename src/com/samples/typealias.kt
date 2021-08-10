package com.samples

// 该文件主要用于学习kotlin类型别名

class A {
    inner class Inner()
}

class B {
    inner class Inner()
}

// 类型别名不会引入新类型，它们等效于相应的底层类型
typealias AInner = A.Inner
typealias BInner = B.Inner

typealias Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p(42)

// Main函数
fun main() {
    val f: (Int) -> Boolean = { it > 0 }
    println(foo(f)) // 输出 "true"

    val p: Predicate<Int> = { it > 0 }
    println(listOf(1, -2).filter(p)) // 输出 "[1]"
}