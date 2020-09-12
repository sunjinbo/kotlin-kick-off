package kotlin.syntax

// 数组
val arr1 = arrayOf(1, 2, 3)
val arr2 = Array(3) { it -> it.inc()}

val intArr: IntArray = intArrayOf(1,2,3)
val longArr: LongArray = longArrayOf(1L,2L,3L)
val floatArr: FloatArray = floatArrayOf(1.0f,2.0f,3.0f)
val doubleArr: DoubleArray = doubleArrayOf(1.0,2.02,3.03333)
val booleanArr: BooleanArray = booleanArrayOf(false,true,false)

val fixedSizeArr = arrayOfNulls<Int>(6)  // 创建指定长度的数组且无元素
val empty = emptyArray<Int>()
val intArray = IntArray(3)

// 二维数组
val arr = Array(3){IntArray(3)}

// 列表

// HashMap

// 字典