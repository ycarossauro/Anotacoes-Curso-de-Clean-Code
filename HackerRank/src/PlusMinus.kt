fun main() {
    val arr = arrayOf(6,-2,-3,4,0,6)
    plusMinus(arr)
}

fun plusMinus(arr: Array<Int>): Unit {
    var posSum = 0
    var negSum = 0
    var zeroSum = 0

    arr.forEach{
        when {
            it > 0 -> posSum++
            it < 0 -> negSum++
            else -> zeroSum++
        }
    }

    val posRatio = posSum.toDouble() / arr.size
    val negRatio = negSum.toDouble() / arr.size
    val zeroRatio = zeroSum.toDouble() / arr.size

    println(String.format("positive: %.6f", posRatio))
    println(String.format("negative : %.6f", negRatio))
    println(String.format("zero: %.6f", zeroRatio))
}