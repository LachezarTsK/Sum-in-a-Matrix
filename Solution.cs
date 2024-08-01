
using System;

public class Solution
{
    public int MatrixSum(int[][] input)
    {
        for (int row = 0; row < input.Length; ++row)
        {
            Array.Sort(input[row]);
        }

        int matrixSum = 0;
        for (int column = input[0].Length - 1; column >= 0; --column)
        {
            int maxInColumn = 0;
            for (int row = 0; row < input.Length; ++row)
            {
                maxInColumn = Math.Max(input[row][column], maxInColumn);
            }
            matrixSum += maxInColumn;
        }
        return matrixSum;
    }
}
