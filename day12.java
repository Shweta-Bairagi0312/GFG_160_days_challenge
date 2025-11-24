///Max Circular Subarray Sum

class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int total = 0;
        int currmax = 0, maxsum = Integer.MIN_VALUE;
        int currmin = 0, minsum = Integer.MAX_VALUE;
        
       for(int num: arr){
           total += num;
           
           currmax = Math.max(num, currmax+num);
           maxsum = Math.max(maxsum, currmax);
           
           currmin = Math.min(num, currmin+num);
           minsum = Math.min(minsum, currmin);
           
           
       }
       if(maxsum<0) return maxsum;
           
        int maxwrap = total-minsum;
        
        return Math.max(maxsum,maxwrap);
    }
}
