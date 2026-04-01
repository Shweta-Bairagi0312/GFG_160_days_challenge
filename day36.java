class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int num = image[sr][sc];
        if(image[sr][sc]==color){
            return image;
        }
        dfs(image,sr,sc, color, num);
        return image;
        
    }
    public static void dfs(int[][] image, int i,int j,int color,int num){
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=num){
            return;
        }
        image[i][j]=color;
        dfs(image,i+1,j, color, num);
        dfs(image,i-1,j, color, num);
        dfs(image,i,j-1, color, num);
        dfs(image,i,j+1, color, num);

    }
}
