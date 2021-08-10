package com.samples

// 该文件主要用于学习kotlin的Object Keyword

// In Kotlin you also have the object keyword. 
// It is used to obtain a data type with a single implementation.

// object Expression
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) : Int {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special
    return total
}

// object Declaration
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

// Companion Objects
class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

// Main函数
fun main() {
    println(rentPrice(10, 2, 1))

    DoAuth.takeParams("username", "password")

    BigBen.getBongs(10)
}