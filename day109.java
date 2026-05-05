class Solution {
    public int countPartitions(int[] nums) {
        int count = 0; 
        int n = nums.length;
        for(int i = 0; i<n-1;i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int left = 0; left<=i; left++){
                 sum1 += nums[left];
            }

            for(int right = i+1; right<n;right++){
                sum2 += nums[right];
            }

           int diff = sum1-sum2;
           if(diff%2==0){
            count++;
           }

        }
        return count++;
        
    }
}
