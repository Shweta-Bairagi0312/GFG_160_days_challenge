class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // if lengths differ, not anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // convert to char arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // compare
        return Arrays.equals(arr1, arr2);
    }

    
}
