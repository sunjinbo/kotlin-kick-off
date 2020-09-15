package leetcode.basic

import java.util.*

// 广度有限搜索算法
fun bfs(matrix: Array<IntArray>, target: Int) : Boolean {
    // 创建一个空队列
    val queue: Queue<Int> = LinkedList<Int>()

    // 创建一个已搜索列表
    var searched: MutableList<Int> = mutableListOf()

    // 将其实节点的邻居放到队列中去
    traverseNeighbors(matrix, 0, queue, searched)

    while (!queue.isEmpty()) { // 只要队列不为空
        var node = queue.poll()
        if (node == target) {
            return true
        } else{
            traverseNeighbors(matrix, node, queue, searched)
        }
    }

    return false
}

// 辅助函数，遍历节点node的邻居，然后将其放置到队列中
fun traverseNeighbors(matrix: Array<IntArray>, node: Int, queue: Queue<Int>, searched: MutableList<Int>) {
    if (node >= 0 && node < matrix.size) {
        var arr = matrix[node]
        for (i in arr.indices) {
            if (arr[i] == 1 && !searched.contains(i)) {
                searched.add(i)
                queue.offer(i)
            }
        }
    }
}

// Main函数
fun main(args: Array<String>) {
    var matrix = getUndirectedGraph()
    var found = bfs(matrix, 5)
    if (found)
        println("We find the destination!")
    else
        println("We didn't find the destination!")
}