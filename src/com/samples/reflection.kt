package com.samples

import kotlin.reflect.KFunction
import kotlin.reflect.KClass

// 该文件主要用于学习kotlin反射的使用

data class ReflectClazz(val p: Int)

fun getKClass(o: Any): KClass<Any> = o.javaClass.kotlin

// Main函数
fun main() {
    var clz = ReflectClazz(2)
    println(getKClass(clz))
}