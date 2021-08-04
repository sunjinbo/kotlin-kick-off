package com.samples

// 该文件主要用于学习kotlin类的继承关系

// 继承 - Inheritance
open class BaseClazz {
    var name: String

    init { println("Initializing a base class") }

    constructor(name: String) {
        println("Constructor a base class")
        this.name = name
    }

    open fun getClassName(): String {
        return "com.samples.BaseClazz - $name"
    }
}

class DerivedClazz : BaseClazz {
    init { println("Initializing a derived class") }

    constructor(name: String) : super(name) {
        println("Constructor a derived class")
    }

    override fun getClassName(): String {
        return "com.samples.DerivedClazz - $name"
    }
}

// 抽象类 - Abstract classes
abstract class AbsClazz {
    abstract fun getClassName(): String
}

class Clazz : AbsClazz() {
    override fun getClassName(): String {
        return "com.samples.AbsClazz - abstract classes"
    }
}

// 多重继承
open class Rectangle {
    open fun draw() {
        println("com.samples.Rectangle.draw()")
    }
}

interface Polygon {
    // interface members are 'open' by default
    fun draw() {
        println("com.samples.Polygon.draw()")
    }
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
        println("com.samples.Square.draw()")
    }
}

// Main函数
fun main() {
    var baseClz = BaseClazz("base classes")
    println(baseClz.getClassName())

    var derivedClz = DerivedClazz("derived classes")
    println(derivedClz.getClassName())

    var absClz = Clazz()
    println(absClz.getClassName())

    var square = Square()
    square.draw()
}
