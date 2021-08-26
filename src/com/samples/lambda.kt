package com.samples

import kotlin.comparisons.maxOf

// 该文件主要用于学习lambda表达式的使用

data class Pig(val name: String, val age: Int)

// Main函数
fun main() {
    val sum = { x:Int, y:Int -> x + y } // lambda表达式
    println(sum(2, 3))

    val pigs = listOf(Pig("Peter", 10), Pig("Tom", 3))
    
    var oldPig = pigs.maxByOrNull({ pig: Pig -> pig.age })
    println(oldPig)

    // 如果lambda表达式是函数的最后一个实参，可以放到括号外面
    oldPig = pigs.maxByOrNull() { pig: Pig -> pig.age }
    println(oldPig)

    // 如果lambda表达式的唯一实参，可以省略前面的()括号
    oldPig = pigs.maxByOrNull { pig: Pig -> pig.age }
    println(oldPig)

    // 如果lambda表达式的类型可以被推导出来，可以省去显式指定它
    oldPig = pigs.maxByOrNull { pig -> pig.age }
    println(oldPig)

    // 如果你想用变量来保存lambda表达式，就无法推导出参数类型，必须显式指定参数类型
    var lambda = { pig: Pig -> pig.age }
    oldPig = pigs.maxByOrNull(lambda)
    println(oldPig)

    // 如果lambda表达式的上下文只有一个参数且可以被推导出来，则自动生成it参数名称
    oldPig = pigs.maxByOrNull { it.age }
    println(oldPig)

    // 如果lambda表达式是函数的最后一个实参，但不是唯一的实参
    var name = pigs.joinToString(" - ") { pig: Pig -> pig.name }
    println(name)
}