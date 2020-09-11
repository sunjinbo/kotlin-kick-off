package kotlin.syntax

import java.lang.Exception

// 异常try-catch
fun exceptionFun(num: Int) : Int {
    val X = 100
    var result = 0
    try {
        result = X / num
    } catch (exception: Exception) {
        return -1
    } finally {
        return result
    }
}

// Main函数
fun main() {
    exceptionFun(10)
    exceptionFun(0)
}
