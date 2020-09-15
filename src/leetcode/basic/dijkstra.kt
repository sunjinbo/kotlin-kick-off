package leetcode.basic

// Dijkstra算法
fun dijkstra(matrix: Array<IntArray>) : Int {
    return -1
}

// Main函数
fun main(args: Array<String>) {
    var matrix = getOrientedGraph()
    var path = dijkstra(matrix)
    println("The shortest path is $path")
}
