package kotlin.syntax

// 类
abstract class Animal {
    val TAG = this.javaClass.simpleName  // 自身的属性

    // 自身的函数
    fun test() : Unit{
        // exp
    }
    abstract var name : String           // 抽象属性
    abstract fun init()                  // 抽象方法
}

// 空类
class Empty

// 接口
interface Action {
    fun bark()
}

// 继承
class Dog : Animal(), Action {
    override var name: String
        get() = "dog"
        set(value) {}

    override fun init() {
        println("I am $name")
    }

    override fun bark() {
        println("bark")
    }
}

// Main函数
fun main() {
    var dog = Dog()
    dog.init()
    dog.bark()
}