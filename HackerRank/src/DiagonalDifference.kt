class DiagonalDifference {

    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var principalDiagonal = 0
        var secondDiagonal = 0
        val n = arr.size

        for(i in 0 until n){
            principalDiagonal += arr[i][i]
            secondDiagonal += arr [i][n - 1 - i]
        }

        return if(principalDiagonal > secondDiagonal){
            principalDiagonal - secondDiagonal
        } else {
            secondDiagonal - principalDiagonal
        }
    }
}