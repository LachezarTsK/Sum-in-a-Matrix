
package main

import (
    "fmt"
    "slices"
)

func matrixSum(input [][]int) int {
    for row := range input {
        slices.Sort(input[row])
    }

    matrixSum := 0
    for column := len(input[0]) - 1; column >= 0; column-- {
        maxInColumn := 0
        for row := range input {
            maxInColumn = max(input[row][column], maxInColumn)
        }
        matrixSum += maxInColumn
    }
    return matrixSum
}
