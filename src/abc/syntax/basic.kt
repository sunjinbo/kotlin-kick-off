package abc.syntax

import java.util.Random

// 定义一个简单的函数
fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b
}

// 枚举的通常用法
enum class Color {
    RED, GREEN, BLUE
}

// 枚举的高级用法
enum class SuperColor(var r: Int, var g: Int, var b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b;
}

// Main函数
fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Hello, ${args[0]}") // 使用${}语法支持插入
    }

    val a: Int = 1 // 可以指定变量的类型，也可以不指定
    var b = 4
    var c = max(a, b)
    println("The kotlin.syntax.max number is ${c}")

    // 可变变量&不可变变量
    val e = 8 // val 相当于Java语言中的final
    var d = 9

    // e = 10 // Val cannot be reassigned
    d = 12

    var random = Random()
    var r = random.nextInt()

    var color: Color = Color.BLUE

    when (color) {
        Color.RED -> print("red!")
        Color.GREEN -> print("green!")
        Color.BLUE -> print("blue!")
    }

    var superColor: SuperColor = SuperColor.GREEN

    when (superColor) {
        SuperColor.RED -> print("${superColor.rgb()}")
        SuperColor.GREEN -> print("${superColor.rgb()}")
        SuperColor.BLUE -> print("${superColor.rgb()}")
    }
}
