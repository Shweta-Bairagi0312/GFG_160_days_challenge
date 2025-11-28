
///Add Binary Strings


class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        while(i>=0||j>=0|| carry==1){
            int sum = carry;
            
            if(i>=0) sum+= s1.charAt(i--) -'0';
            if(j>=0) sum+= s2.charAt(j--) -'0';
            
            sb.append(sum%2);
            carry = sum/2;
            
        }
        String res = sb.reverse().toString();
        int k = 0;
        while(k<res.length() && res.charAt(k)=='0'){
            k++;
        }
        if(k==res.length()) return "0";
        
        return res.substring(k);
    }
}
