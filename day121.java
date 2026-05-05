class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int val: map.values()){
            if(val==2|| val==3||val==5||val==7){
                return true;
            }
            if(val==1||val%2==0||val%3==0||val%5==0||val%7==0){
                continue;
            }
            return true;
        }

        return false;
        
    }
}
