fun main() {
    val arr = arrayOf(6,2,3,4,3,6)
    bubbleShort(arr)
    println(arr.joinToString())
}

/**
 * Bubble Sort works by comparing two number at a time and moving the larger one to the right.
 */
private fun bubbleShort(arr: Array<Int>){
    val s = arr.size

    for(i in 0..< s - 1){ // control many full passes
        for(j in 0..< s - i - 1){ // swap elements
            if(arr[j] > arr[j + 1]) {  // If left element > right element → Swap
            val temp = arr[j] // Step 1: Store arr[j] (left value) in a temporary variable
            arr[j] = arr[j+1] // Step 2: Replace arr[j] with arr[j+1] (right value)
            arr[j+1] = temp // Step 3: Replace arr[j+1] with the old arr[j] (stored in temp)
            }
        }
    }
}