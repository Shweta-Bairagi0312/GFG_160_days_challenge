/// implement atoi


class Solution {
    public int myAtoi(String s) {
        // code here
        
        int i = 0;
        int sign = 1;
        int n = s.length();
        long num = 0;
        
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        
        if(i==n) return 0;
        
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            if(s.charAt(i)=='-') sign = -1;
              
              i++;
               
              
        }
        
        while(i<n && s.charAt(i)=='0'){
            i++;
        }
        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit =  s.charAt(i) -'0';
            num = num*10+digit;
            
            if(sign==1 && num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1 && -num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(num*sign);
    }
}

