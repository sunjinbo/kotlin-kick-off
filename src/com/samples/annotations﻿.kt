package com.samples

// 该文件主要用于学习kotlin注解使用

annotation class Fancy

annotation class Special(val why: String)

@Fancy class Foo {
    @Fancy fun baz(@Fancy foo: Int): Int {
        return (@Fancy 1)
    }
}

// Main函数
fun main() {

}