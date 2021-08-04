package com.samples

// 该文件主要用于学习kotlin类与对象

// 简单的类
class Clz1
class Clz2 {}
class Clz3 constructor(name: String) {}
class Clz4(name: String) {}
class Clz5(name: String) {
    var name:String
    init { 
        this.name = name 
    }
}
class Clz6 constructor(val name: String) {}
class Clz7(var name: String) {}

// 类的成员
class Clz8(private var name: String) {
    private var age:Int

    // Companion objects
    companion object {
        const val clzName = "Clz8"

        fun getClassName(): String {
            return clzName
        }
    }

    // initializer blocks
    init {
        age = 0
        // strength = 10 // complier error, variable cannot be initialized before declaration
    }

    // Secondary Constructors
    constructor(name: String, age: Int) : this(name) {
        this.age = age
        strength = 2
    }

    // Functions
    fun getName() : String {
        return name
    }

    fun getAge() : Int {
        return age
    }

    // Properties
    var address: String = ""

    val hasAddress: Boolean
        get() = this.address.length > 0

    var strength: Int = 1
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    // Nested classes
    class NestedClz {
        fun foo() = 2
        // fun bar() = name // compiler error, Nested class can not access the members of its outer class.
    }

    // Inner classes
    // A nested class marked as inner can access 
    // the members of its outer class.
    inner class InnerClz {
        fun foo() = age
    }
}

// 密封类 - Sealed classes
sealed class SealedClz() {
    var age: String = ""
        get() = field
}

// sealed class所有的子类必须和sealed class在同一个文件声明
// sealed class本身是抽象的, 不能被直接实例化, 可以有abstract成员
// sealed class的构造函数默认是private的，密封类不允许有非private构造函数
class OpenClz1() : SealedClz() {

}

class OpenClz2() : SealedClz() {

}

// The key benefit of using sealed classes comes into play 
// when you use them in a when expression.
fun checkClz(clz: SealedClz) {
    when (clz) {
        is OpenClz1 -> println("com.samples.OpenClz1")
        is OpenClz2 -> println("com.samples.OpenClz2")
    }
}

// 数据类 - Data classes
// The compiler automatically derives the following members 
// from all properties declared in the primary constructor:
// 1. equals()/ hashCode() pair
// 2. toString() of the form "DataClz(name=John, age=42)"
// 3. componentN() functions corresponding to the properties in their order of declaration.
// 4. copy() function
data class DataClz(var name: String, var age: Int)

// Main函数
fun main() {
    var s1 = Clz1()
    var s2 = Clz2()
    var s3 = Clz4("s3")
    // println(s3.name) // complier error, name is not a member variable of Sample4
    var s4 = Clz4("s4")
    // println(s4.name) // complier error, name is not a member variable of Sample5
    var s5 = Clz5("s5")
    println(s5.name)
    var s6 = Clz6("s6")
    println(s6.name)
    var s7 = Clz7("s7")
    s7.name = "s7"
    println(s7.name)
    var s8 = Clz8("s8", 19)
    println(Clz8.getClassName())
    println(s8.getName())
    println("${s8.getAge()}")
    println("${s8.strength}")
    s8.strength = 12
    println("${s8.strength}")
    s8.strength = 0
    println("${s8.strength}")

    // 测试密封类
    // var sealedClz = SealedClz() // complier error, sealed class本身是抽象的, 不能被直接实例化
    var openClz = OpenClz1()
    checkClz(openClz)

    // 测试数据类
    var dataClz = DataClz("Weex", 34)
    println(dataClz.toString())
    println(dataClz.name)
    var copyClz = dataClz.copy()
    copyClz.name = "Fox"
    println(copyClz.toString())
    println(dataClz.equals(copyClz))
}
