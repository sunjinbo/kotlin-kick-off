package kotlinX.syntax

// if判断语句

// when判断语句
fun whenTest(num: Int) {
    when (num) {
        1 -> print('a')
        2 -> print('b')
        3 -> print('c')
        else -> print('d')
    }
}

// for循环语句
fun forTest() {
    var array: Array<Int> = Array(5) { i -> i + 1 }
    for (value in array) {
        print("$value")
    }

    for (value in array.indices) {
        print("$value")
    }

    for (value in 1..100) {
        print("$value")
    }
}

// foreach循环语句
fun foreachTest() {
    val list = arrayListOf("1", "2", "3", "4", "5")
    list.forEach { value -> print("$value") }
}

// while循环语句
fun whileTest() {
    var count:Int = 10
    while (count > 0) {
        count -= 1
        print("$count")
    }

    do {
        count += 1
        print("$count")
    } while (count < 10)
}

// Main函数
fun main() {
    whenTest(2)
    whenTest(8)
    forTest()
    foreachTest()
    whileTest()
}