class Solution {
    public int getLeastFrequentDigit(int n) {
       Map<Integer,Integer>map = new HashMap<>();
       while(n>0){
        int rem = n%10;
        map.put(rem,map.getOrDefault(rem,0)+1);
        n /=10;
       }

       int res = -1;
       int min = Integer.MAX_VALUE;
       for(int num: map.keySet()){
        int freq = map.get(num);
        if(freq<min||(freq==min &&(res==-1||num<res))){
            min = freq;
            res = num;
        }
       }
       return res;

    }
}
