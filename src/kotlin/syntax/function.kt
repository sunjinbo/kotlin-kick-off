package kotlin.syntax

// 没有返回值
fun test1() {
    println("This function do not return value")
}

// 有返回值
fun test2() : String{
    println("This function return a String value")
    return "empty"
}

// 有参数
fun test3(value: Int) {
    println("$value")
}

// 可变参数
fun test4(name: String?, vararg args: Int): Int {
    var result = 0
    for (element in args) {
        result += element
    }
    return result
}

// 单表达式函数
fun test5(exp:Int) :Int= (exp * 1.1).toInt()

// Main函数
fun main() {
    test1()
    test2()
    test3(3)
    test4("numbers", 2, 3, 4)
    test5(3)
}
