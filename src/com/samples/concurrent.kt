package com.samples

import kotlin.concurrent.thread
import kotlin.concurrent.timer
import kotlin.concurrent.fixedRateTimer
import kotlin.concurrent.timerTask
import kotlin.concurrent.schedule
import java.util.Date

// 该文件主要用于学习kotlin线程间同步处理

// Main函数
fun main() {
    var ti = fixedRateTimer("", false, 1000L, 1000L) { println("Timer is running...") }

    var th = thread {
        println("Thread is running...")
        Thread.sleep(3000L)
        println("Thread is died.")
    }

    th.join()
    ti.cancel()
    
    println("Program is died.")
}