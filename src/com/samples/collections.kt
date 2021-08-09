package com.samples

// 该文件主要用于学习kotlin集合的使用

// Main函数
fun main() {
    // List
    var readOnlyList = listOf(1, 2, 3, 4)
    println(readOnlyList)
    var mutableList = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList)
    mutableList.removeAt(mutableList.size - 1)
    readOnlyList = mutableList.toList()
    mutableList.add(5)
    mutableList.add(0, 0)
    println(mutableList)
    println(readOnlyList)

    // Set
    var set = setOf("Java", "Kotlin", "Python", "C++", "Kotlin")
    println(set)
    var mutableSet = mutableSetOf("Java", "Kotlin", "Python", "C++", "Kotlin")
    mutableSet.add("C#")
    mutableSet.add("Go")
    mutableSet.add("Java")
    mutableSet.add("Perl")
    println(mutableSet)
    mutableSet.retainAll(set)
    println(mutableSet)

    // Map
    var map = mapOf("Java" to 1, "Kotlin" to 2, "Python" to 3)
    println(map)
    var mutableMap = mutableMapOf("Java" to 1, "Kotlin" to 2, "Python" to 3, "C++" to 4)
    mutableMap.put("Perl", 7)
    mutableMap.remove("Kotlin")
    println(mutableMap)

    // Init numbers list
    var numbers = listOf(1, -2, 3, -4, 5, -6)
    println(numbers)

    // filter
    println(numbers.filter { it -> it > 0 })
    println(numbers.filter { it -> it < 0 })

    // map
    println(numbers.map { it -> it * 2 })
    println(numbers.map { it -> it * 3 })

    // any, all, none
    println(numbers.any { it > 2 }) // 列表中的数字只要有一个大于2就为true
    println(numbers.all { it % 2 == 0 }) // 列表中的数字都能整除2就为true
    println(numbers.none { it > 6 }) // 列表中的数字都不能大于6时就为true

    // find, findLast
    println(numbers.find { it > 1 }) // 找到列表中第一个大于1的数字
    println(numbers.findLast { it > 1 }) // 从后面开始找到列表中第一个大于1的数字

    // first, last
    println(numbers.first())
    println(numbers.first {it % 2 == 0})
    println(numbers.last())
    println(numbers.last {it % 2 == 0})

    // count
    println(numbers.count())
    println(numbers.count {it % 2 == 0})

    // associateBy, groupBy
    data class Person(val name: String, val city: String, val phone: String)
    val peopleList = listOf(                                                     // 2
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Weex", "Tokyo", "+7-999-456234"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
        )

    println(peopleList.associateBy{ it.phone })
    println(peopleList.associateBy(Person::phone, Person::city))
    println(peopleList.groupBy(Person::city, Person::name))

    // partition
    val evenOdd = numbers.partition { it % 2 == 0 }
    println(evenOdd)
    val (positives, negatives) = numbers.partition { it > 0 }
    println(positives)
    println(negatives)

    // flatMap
    val fruitsBag = listOf("apple","orange","banana","grapes") 
    val clothesBag = listOf("shirts","pants","jeans")
    val cart = listOf(fruitsBag, clothesBag)
    println(cart)
    val mapBag = cart.map { it }
    println(mapBag)
    val flatMapBag = cart.flatMap { it }
    println(flatMapBag)

    // minOrNull, maxOrNull
    val empty = emptyList<Int>()
    println(numbers.minOrNull())
    println(numbers.maxOrNull())
    println(empty.minOrNull())
    println(empty.maxOrNull())

    // sorted
    println(numbers.sorted())
    println(numbers.sortedBy { -it })
    println(numbers.sortedDescending())

    // Map Element Access
    println(map["Kotlin"])
    println(map["Basic"])
    // println(map.getValue("Basic")) // execution error, NoSuchElementException
    val mapWithDefault = map.withDefault { k -> k.length }
    println(mapWithDefault.getValue("Basic"))

    // zip
    // The size of the result collection equals to the minimum size of a source collection.
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)
    println(A zip B)
    val resultReduce = A.zip(B) { a, b -> "$a$b" }
    println(resultReduce)

    // getOrElse
    println(numbers.getOrElse(1) { 42 })
    println(numbers.getOrElse(10) { 42 })
    println(map.getOrElse("Kotlin") { 42 })
    println(map.getOrElse("Basic") { 42 })
}