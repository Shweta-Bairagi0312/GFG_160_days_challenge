class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int a = 1; a<=n; a++){
            for(int b = 1; b<n; b++){
                int c = a*a+b*b;
                int c_sq = (int) Math.sqrt(c);
                if(c_sq*c_sq == c && c_sq<=n){
                    count++;
                }
            }
        }

        return count;

    
    }
}
