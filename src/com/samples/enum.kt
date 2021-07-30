package com.samples

// 该文件主要用于学习kotlin枚举

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}


// Main函数
fun main() {
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.GREEN.containsRed())
}