class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>l1 = new ArrayList<>();
        long ans = 1;
        for(int i = 0; i<=rowIndex; i++){
            l1.add((int)(ans));
            ans = ((rowIndex-i)*ans)/(i+1);
            
        }
        return l1;
    }
}
