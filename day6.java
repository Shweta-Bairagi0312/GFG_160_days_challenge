class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        int count1 = 0;
        int count2 = 0;
        int el1 = 0;
        int el2 = 0;
        for(int i = 0; i<n; i++){
            if(count1 == 0 && arr[i]!= el2){
                count1++;
                el1 = arr[i];
            }
        
        else if(count2 == 0 && arr[i] != el1){
            count2++;
            el2 = arr[i];
        }
        else if(arr[i]==el1){
            count1++;
        }
        else if(arr[i]==el2){
            count2++;
        }
        else{
            count1--;
            count2--;
        }
        
            
        }
        
         ArrayList<Integer> list = new ArrayList<Integer>();
         int res = n/3;
         int count11 = 0;
         int count22 = 0;
         for(int i = 0; i<n; i++){
             if(el1==arr[i]){
                 count11++;
             }
             else if(el2 == arr[i]){
                 count22++;
             }
         }
         if(count11>res){
             list.add(el1);
         }
         if(count22>res){
             list.add(el2);
         }
         
        Collections.sort(list);
        return list;
        
        
    }
}
