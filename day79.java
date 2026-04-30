class Solution {
    public int differenceOfSum(int[] nums) {
        int elsum = 0;
        int digitsum = 0;

        for(int i = 0; i<nums.length; i++){
            elsum += nums[i];
            digitsum += sum(nums[i]);
        }
        return Math.abs(elsum-digitsum);
        
    }
    public static int sum(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num /=10;
            sum += rem;
        }
        return sum;
    }
}
