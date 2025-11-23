class Solution {
    void pushZerosToEnd(int[] arr) {
     int i = 0;
     int n = arr.length;
     for(int j = 0; j<n; j++){
         if(arr[j]!=0){
             int temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;
             i++;
         }
     }
    
        
    }
}
