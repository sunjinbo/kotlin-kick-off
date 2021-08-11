package com.samples

// 该文件主要用于学习kotlin解构声明

// 把一个对象解构成很多变量，这种语法称为解构声明。
data class People(var name: String, var age: Int, var address: String)

fun getAmericaPeople() : People {
    return People("Musk", 45, "California")
}

// Main函数
fun main() {
    val people = People("Jame", 12, "Beijing")
    println(people)
    println(people.component1())
    println(people.component2())
    println(people.component3())
    
    // 如果在解构声明中你不需要某个变量，那么可以用下划线取代其名称
    val (_, _, address) = getAmericaPeople()
    println("$address")
}
