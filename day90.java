class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String str   = Integer.toString(num);
        for(int i = 0; i<=str.length()-k;i++){
            String sub = str.substring(i, i+k);
            int substr = Integer.parseInt(sub);
            if(substr != 0 &&  num % substr == 0){
                count++;
            }


        }
        return count;
    }
}
