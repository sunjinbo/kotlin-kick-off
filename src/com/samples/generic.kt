package com.samples

// 该文件主要用于学习kotlin模版

// 模版类
class Box<T>(t: T) {
    var value = t
}

// 模版方法
fun <T> joint(a: T, b: T): String {
    return "$a $b"
}

// out（协变）如果泛型类只将泛型类型作为函数的返回（输出），那么使用out
// 换句话说，子类泛型对象可以赋值给父类泛型对象，用 out
interface Production<out T> {
    fun produce(): T
}

// in（逆变）如果泛型类只将泛型类型作为函数的入参（输入），那么使用 in
// 换句话说，父类泛型对象可以赋值给子类泛型对象，用 in
interface Consumer<in T> {
    fun consume(item: T)
}

// 如果泛型类既将泛型类型作为函数参数，又将泛型类型作为函数的输出，那么既不用 out 也不用 in
interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}

// 泛型约束(Generic constraints)

// 传入的参数只能是 Number 及其子类，Kotlin 默认的上界是Any?
fun <T : Number> sum(vararg param: T) = param.sumByDouble { it.toDouble() }

// 多个约束可以通过where关键字来实现
open class ClassA
open interface InterfaceB
class MyClass<T>(var variable: Class<T>) where T : ClassA, T : InterfaceB

// 星号投影(Star-projections), 不知道关于泛型实参的任何信息
fun printGenericList(list: List<*>) { // List<*> 表示的是 List<out Any?>
    println(list[0])
}

// Main函数
fun main() {
    val box1: Box<Int> = Box<Int>(1)
    println(box1)
    val box2 = Box(1)
    println(box2)
    println(joint(box1, box2))
    var list = listOf(box1, box2)
    printGenericList(list)
}
