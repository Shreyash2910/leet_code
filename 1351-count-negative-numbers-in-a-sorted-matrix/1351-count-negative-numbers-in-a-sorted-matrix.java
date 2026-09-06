// class Solution {
//     public int countNegatives(int[][] grid) {
//         int rows = grid.length;
//         int cols = grid[0].length;

//         int row = rows - 1;
//         int col = 0;
//         int count = 0;

//         while (row >= 0 && col < cols) {
//             if (grid[row][col] < 0) {
//                 count += cols - col;
//                 row--;
//             } else {
//                 col++;
//             }
//         }

//         return count;
//     }
// }

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int cols = grid[0].length;

for(int i = 0; i < grid.length; i++) {

    for(int j = 0; j < cols; j++) {

        if(grid[i][j] < 0) {
            count += cols - j;
            break;
        }
    }
}
return count;
        
    }
}