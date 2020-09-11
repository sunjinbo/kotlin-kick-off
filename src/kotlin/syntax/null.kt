package kotlin.syntax

// 可空变量的使用
fun test(num: Int) : Int? {
    if (num > 10) {
        return num
    }
    return null
}

// Main函数
fun main() {
    var r1 = test(8)
    println("$r1")

    var r2 = test(18)
    println("$r2")
}
