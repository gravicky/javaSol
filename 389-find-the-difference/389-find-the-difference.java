class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        char res = t.charAt(n);
        for(int i=0;i<n;i++){
            res ^= t.charAt(i);
            res ^=s.charAt(i);
        }
        return res;
    }
}