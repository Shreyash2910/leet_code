class Solution {
    public int equalPairs(int[][] grid) {
        HashMap <String , Integer> row=new HashMap<>();
        HashMap <String , Integer> col=new HashMap<>();
        for (int i = 0; i < grid.length; i++) {    
            StringBuilder sb = new StringBuilder();      
            for (int j = 0; j < grid[i].length; j++){
                sb.append(grid[i][j]).append(",");
            }
            String key = sb.toString();
            row.put(key, row.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < grid.length; i++) {    
            StringBuilder sb = new StringBuilder();      
            for (int j = 0; j < grid[i].length; j++){
                sb.append(grid[j][i]).append(",");
            }
            String key = sb.toString();
            col.put(key, col.getOrDefault(key, 0) + 1);
        }
        int count = 0;
        for (String key : row.keySet()) {
            if (col.containsKey(key)) {
                count += row.get(key) * col.get(key);
            }
        }
        return count;
    }
}