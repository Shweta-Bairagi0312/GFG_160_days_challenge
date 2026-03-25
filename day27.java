class Solution {
    public String getSmallestString(String s) {
        int n = s.length();
        char[] str = s.toCharArray();

        for(int i = 0; i<n-1; i++){
            int a = str[i]-'0';
            int b = str[i+1]-'0';
            if(a%2==b%2 && a>b){
                char temp = str[i];
                str[i] = str[i+1];
                str[i+1] = temp;
                break;
            }

        }
        return new String(str);
    }
}
