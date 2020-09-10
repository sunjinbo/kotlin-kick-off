class t3 {
    fun findDuplicateNumbers(intArr: IntArray) : Int {
        var count = 0
        for (index in intArr.indices) {
            while (index != intArr[index]) {
                if (intArr[index] == intArr[intArr[index]]) {
                    // a duplicate number is found
                    ++count
                    break
                } else {
                    var m = intArr[index];
                    var temp = m
                    intArr[index] = intArr[m]
                    intArr[m] = temp
                }
            }
        }
        return count
    }
}

fun main() {
    val intArr: IntArray = intArrayOf(2, 3, 1, 0, 2, 5, 3)
    var t3 = t3()
    var count = t3.findDuplicateNumbers(intArr)
    println(count)
}
