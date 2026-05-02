class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0; 
        for(int n:nums){
            sum |= n;
        }
        return sum*(1<<(nums.length-1));
    }
}
