
/**
 * @param {number[][]} input
 * @return {number}
 */
var matrixSum = function (input) {
    for (let row = 0; row < input.length; ++row) {
        input[row].sort((x, y) => x - y);
    }

    let matrixSum = 0;
    for (let column = input[0].length - 1; column >= 0; --column) {
        let maxInColumn = 0;
        for (let row = 0; row < input.length; ++row) {
            maxInColumn = Math.max(input[row][column], maxInColumn);
        }
        matrixSum += maxInColumn;
    }
    return matrixSum;
};
