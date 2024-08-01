
#include <ranges>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {

public:
    int matrixSum(vector<vector<int>>& input) const {
        for (size_t row = 0; row < input.size(); ++row) {
            ranges::sort(input[row]);
        }

        int matrixSum = 0;
        for (size_t column = input[0].size() - 1; column != variant_npos; --column) {
            int maxInColumn = 0;
            for (int row = 0; row < input.size(); ++row) {
                maxInColumn = max(input[row][column], maxInColumn);
            }
            matrixSum += maxInColumn;
        }
        return matrixSum;
    }
};
