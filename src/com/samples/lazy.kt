package com.samples

// 懒加载
data class DataClazz(var name: String)
class LazyClazz {
    lateinit var data: DataClazz // lateinit 只能用在var类型，且lateinit不能用在可空的属性上和java的基本类型上
    val name: String by lazy { "sherlbon" } // lazy{} 只能用在val类型，lazy在第一次被调用时就被初始化，想要被改变只能重新定义

    fun lateName(): String {
        data = DataClazz("weex")
        return data.name
    }

    // lateinit可以在任何位置初始化并且可以初始化多次
    fun lateNameTwice(): String {
        data = DataClazz("Bolinton")
        return data.name
    }
}

// Main函数
fun main() {
    var lazy = LazyClazz()
    println(lazy.name)
    println(lazy.lateName())
    println(lazy.lateNameTwice())
}