class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i = 0; i<nums.length; i++){
            int sum = digitsum(nums[i]);
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
    public static int digitsum(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}
