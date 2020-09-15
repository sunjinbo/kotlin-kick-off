package leetcode.basic

// 使用邻接矩阵(Adjacency Matrix)来表示一个有向图
fun getOrientedGraph(): Array<IntArray> {
    val matrix = Array(6) { IntArray(6) }
    matrix[0] = intArrayOf(0, 1, 1, 0, 0, 0)
    matrix[1] = intArrayOf(1, 0, 0, 1, 1, 0)
    matrix[2] = intArrayOf(1, 0, 0, 0, 1, 0)
    matrix[3] = intArrayOf(0, 1, 0, 0, 1, 1)
    matrix[4] = intArrayOf(0, 1, 1, 1, 0, 1)
    matrix[5] = intArrayOf(0, 0, 0, 1, 1, 0)
    return matrix;
}
