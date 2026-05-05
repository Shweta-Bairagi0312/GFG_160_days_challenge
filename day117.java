class Solution {
    public int smallestNumber(int n) {
        int bits = Integer.SIZE - Integer.numberOfLeadingZeros(n);
        return(1<<bits)-1;
    }
}
