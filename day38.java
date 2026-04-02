class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int [][]directions = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> q = new ArrayDeque<>();

        // Step 1: Initialize
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // Step 2: BFS
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow >= 0 && newRow < rows &&
                    newCol >= 0 && newCol < cols &&
                    mat[newRow][newCol] > mat[row][col] + 1) {

                    mat[newRow][newCol] = mat[row][col] + 1;
                    q.add(new int[]{newRow, newCol});
                }
            }
        }

        return mat;        
    }
}
