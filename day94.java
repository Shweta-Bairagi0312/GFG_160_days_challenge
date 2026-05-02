class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer>visited = new HashSet<>();
        int count = 0;
        for(int i = 0; i<isConnected.length; i++){
            if(!visited.contains(i)){
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;

    }
    public static void dfs(int curr,int[][] isConnected,Set<Integer>visited){
        visited.add(curr);
        for(int i = 0; i<isConnected[curr].length; i++){
            int connect = isConnected[curr][i];
            if(connect==1 && !visited.contains(i)){
                dfs(i,isConnected,visited);
            }
        }
    }

}
