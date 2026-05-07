class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int digit = 0;
        while(n>0){
            int rem = n%10;
            n /= 10;
            digit = digit*10+rem;
            
        }
        return Math.abs(digit-num);

        
    }
}
