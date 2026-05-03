class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        Queue<int[]>q = new ArrayDeque<>();
        int[][]direction = {{0,1},{0,-1},{1,0},{-1,0}};      
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                }
                else{
                    mat[i][j] = Integer.MAX_VALUE;
                }

            }
        }


        while(!q.isEmpty()){
            int[]cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            for(int[]dir: direction){
                int newrow = row+dir[0];
                int newcol = col+dir[1];

                if(newrow>=0 && newrow<rows&& newcol>=0&&newcol<cols && mat[newrow][newcol]>mat[row][col]+1){
                    mat[newrow][newcol]=mat[row][col]+1;

                    q.add(new int[]{newrow, newcol});
                }
            }

        }

        return mat;



    }
}
