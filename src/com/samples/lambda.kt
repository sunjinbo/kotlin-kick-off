package com.samples

import kotlin.comparisons.maxOf

// 该文件主要用于学习lambda表达式的使用

data class Dog(val name: String, val age: Int)

// Main函数
fun main() {
    val sum = { x:Int, y:Int -> x + y } // lambda表达式
    println(sum(2, 3))

    val dogs = listOf(Dog("Peter", 10), Dog("Tom", 3))
    
    var oldDog = dogs.maxByOrNull({ dog: Dog -> dog.age })
    println(oldDog)

    // 如果lambda表达式是函数的最后一个实参，可以放到括号外面
    oldDog = dogs.maxByOrNull() { dog: Dog -> dog.age }
    println(oldDog)

    // 如果lambda表达式的唯一实参，可以省略前面的()括号
    oldDog = dogs.maxByOrNull { dog: Dog -> dog.age }
    println(oldDog)

    // 如果lambda表达式的类型可以被推导出来，可以省去显式指定它
    oldDog = dogs.maxByOrNull { dog -> dog.age }
    println(oldDog)

    // 如果lambda表达式的上下文只有一个参数且可以被推导出来，则自动生成it参数名称
    oldDog = dogs.maxByOrNull { it.age }
    println(oldDog)

    // 如果lambda表达式是函数的最后一个实参，但不是唯一的实参
    var name = dogs.joinToString(" - ") { dog: Dog -> dog.name }
    println(name)
}