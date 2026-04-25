class Solution {
    public static int sum(int val){
        int sum = 0;
        while(val>0){
            sum += (val%10);
            val /= 10;
        }
        return sum;
    }
    public int minElement(int[] nums) {

        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            nums[i] =sum(nums[i]);
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
        
    }
}
