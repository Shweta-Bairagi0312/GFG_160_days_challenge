class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int i = 0; i<nums.length; i++){
            prod *= nums[i];
        if(prod>0){
           prod= 1;
        }
        else if(prod==0){
            prod =0;
        }
        else{
            prod = -1;
        }
        }
        return prod;
        
        
    }
}
