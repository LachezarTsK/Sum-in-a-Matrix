
import java.util.Arrays;

public class Solution {

    public int matrixSum(int[][] input) {
        for (int row = 0; row < input.length; ++row) {
            Arrays.sort(input[row]);
        }

        int matrixSum = 0;
        for (int column = input[0].length - 1; column >= 0; --column) {
            int maxInColumn = 0;
            for (int row = 0; row < input.length; ++row) {
                maxInColumn = Math.max(input[row][column], maxInColumn);
            }
            matrixSum += maxInColumn;
        }
        return matrixSum;
    }
}
