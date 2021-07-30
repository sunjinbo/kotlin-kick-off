package com.samples

// 该文件主要用于学习kotlin构造方法的使用

// 一个类可以有一个主构造函数以及一个或多个次构造函数

// 主构造函数是类头的一部分：它跟在类名（与可选的类型参数）后，
// 主构造函数不能包含任何的代码。初始化的代码可以放到以 init 关键字作为前缀的初始化块（initializer blocks）中
class Animal(name: String) { 
    init {
        println(name)
    }
}

class Dog(var name: String) {
    var age: Int

    init {
        age = 0
    }
}

// 如果构造函数有注解或可见性修饰符，这个 constructor 关键字是必需的，并且这些修饰符在它前面
class Customer public constructor(name: String) { 
    init {
        println(name)
    }
 }

// 类也可以声明前缀有 constructor的次构造函数
class Person(val name: String) {
    var children: MutableList<Person> = mutableListOf()
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor - $i")
    }
}

// Main函数
fun main() {
    var animal = Animal("Fish")
    println(animal.toString())

    var dog = Dog("pet")
    println(dog.toString())

    var Joe = Customer("Joe")
    println(Joe.toString())

    var Tom = Person("Tom")
    println(Tom.toString())

    var Lucy = Person("Lucy", Tom)
    println(Lucy.toString())

    var cotr = Constructors(5)
    println(cotr.toString())
}
