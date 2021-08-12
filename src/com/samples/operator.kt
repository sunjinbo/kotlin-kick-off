package com.samples

// 该文件主要用于学习kotlin的Operator overloading

data class Point(val x: Int, val y: Int) {
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }

    operator fun minus(p: Point): Point {
        return Point(x - p.x, y - p.y)
    }

    operator fun times(p: Point): Point {
        return Point(x * p.x, y * p.y)
    }

    operator fun div(p: Point): Point {
        return Point(x / p.x, y / p.y)
    }

    operator fun rem(p: Point): Point {
        return Point(x % p.x, y % p.y)
    }
}

// Main函数
fun main() {
    var p1 = Point(2, 4)
    var p2 = Point(4, 4)
    var(x, y) = p1 + p2
    println(x)
    println(y)
}
