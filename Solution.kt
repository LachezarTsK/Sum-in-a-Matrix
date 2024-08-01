
import kotlin.math.max

class Solution {
    fun matrixSum(input: Array<IntArray>): Int {
        for (row in input.indices) {
            input[row].sort()
        }

        var matrixSum = 0
        for (column in input[0].size - 1 downTo 0) {
            var maxInColumn = 0
            for (row in input.indices) {
                maxInColumn = max(input[row][column], maxInColumn)
            }
            matrixSum += maxInColumn
        }
        return matrixSum
    }
}
