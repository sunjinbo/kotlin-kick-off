package leetcode.basic

// 使用邻接矩阵(Adjacency Matrix)来表示一个有向图
fun getOrientedGraph(): Array<IntArray> {
    val matrix = Array(4) { IntArray(4) }
    matrix[0] = intArrayOf(0, 6, 2, Int.MAX_VALUE)
    matrix[1] = intArrayOf(Int.MAX_VALUE, 0, Int.MAX_VALUE, 1)
    matrix[2] = intArrayOf(Int.MAX_VALUE, 3, 0, 5)
    matrix[3] = intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE, Int.MAX_VALUE, 0)
    return matrix;
}
