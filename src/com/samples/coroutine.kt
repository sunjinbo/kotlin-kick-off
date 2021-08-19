package com.samples

import kotlin.coroutines.*
import kotlin.coroutines.startCoroutine
import kotlin.suspend

// 该文件主要用于学习kotlin协程的使用

// Main方法
fun main() {
    var continuation = suspend {
        5
    }.createCoroutine(object : Continuation<Int> {
        override val context: CoroutineContext = EmptyCoroutineContext

        override fun resumeWith(result: Result<Int>) {
            println("Coroutine End: $result")
        }
    })
    continuation.resume(Unit)
}