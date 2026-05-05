class Solution {
    public boolean hasSameDigits(String s) {

        
        while(s.length()>2){
        char[]digits = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<digits.length-1; i++){
            int first = digits[i]-'0';
            int second = digits[i+1]-'0';
            int sum = (first+second)%10;
            sb.append(sum);
            
        }
        s = sb.toString();
        


        }
        return (s.charAt(0)==s.charAt(1));
        
    }
}
