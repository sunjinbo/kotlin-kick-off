package leetcode.exercise

class t4 {
    fun findDuplicateNumbers(intArr: IntArray) : Int {
        var start = 1
        var end = intArr.size - 1

        while (start <= end) {
            var middle = (end - start) / 2 + start
            var count = countRange(intArr, start, middle)
            if (start == end) {
                if (count > 1)
                    return start
                else
                    break
            }

            if (count > middle - start + 1) {
                end = middle
            } else{
                start = middle + 1
            }
        }

        return -1
    }

    fun countRange(intArr: IntArray, start: Int, end: Int) : Int {
        var count = 0
        for (index in intArr.indices) {
            if (intArr[index] in start..end) {
                count += 1
            }
        }
        return count
    }
}

fun main() {
    val intArr: IntArray = intArrayOf(2, 3, 5, 4, 3, 2, 6, 7)
    var t4 = t4()
    var count = t4.findDuplicateNumbers(intArr)
    println(count)
}