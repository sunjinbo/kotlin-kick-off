package leetcode.basic

// Dijkstra算法
fun dijkstra(matrix: Array<IntArray>) : Int {
    // 创建一个一维数组来存储开销状况
    var costs = matrix[0].clone()
    // 创建一个已搜索列表
    var searched: MutableList<Int> = mutableListOf()
    searched.add(0)

    var node = findLowerCostNode(costs, searched)
    while (node != -1) {
        var neighbors = matrix[node]
        var cost = costs[node]
        for (n in neighbors.indices) {
            var newCost = neighbors[n] + cost
            if (costs[n] > newCost) {
                costs[n] = newCost
            }
        }
        searched.add(node)
        node = findLowerCostNode(costs, searched)
    }

    return costs[3]
}

fun findLowerCostNode(costs: IntArray, searched: MutableList<Int>) : Int {
    var node: Int = -1
    var cost: Int = Int.MAX_VALUE
    for (i in costs.indices) {
        if (!searched.contains(i)) {
            if (costs[i] < cost) {
                cost = costs[i]
                node = i
            }
        }
    }
    return node
}

// Main函数
fun main(args: Array<String>) {
    var matrix = getOrientedGraph()
    var minutes = dijkstra(matrix)
    println("The shortest path need $minutes minutes.")
}
