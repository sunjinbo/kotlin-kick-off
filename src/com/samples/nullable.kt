package com.samples

// 该文件主要用于学习kotlin可空类型的使用

fun main() {
    var nullableInt: Int? = 10
    println(nullableInt)
    var nonNullInt = nullableInt as? Int // Safe casts
    println(nonNullInt)
    println(nullableInt?.inc())
    nullableInt = null
    val result = nullableInt?.plus(100) ?: 12
    println(result)

    // Collections of a nullable type
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    nullableList.forEach { println(it) }
    val intList: List<Int> = nullableList.filterNotNull()
    intList.forEach { println(it) }
}
