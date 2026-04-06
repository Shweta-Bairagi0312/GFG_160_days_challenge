class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer>list = new ArrayList<>();
        for(int i = left; i<= right; i++){
            if(isSelf(i)){
                list.add(i);
            }
        }
        return list;
        
    }
     public static boolean isSelf(int num){
        int ori = num;
        while(num>0){
            int rem = num%10;
            if(rem==0||ori%rem !=0){
                return false;
            }

            num /= 10;
            

        }
        return true;
     }
}
