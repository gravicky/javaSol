class Solution {
    public void reverseString(char[] s) {
        int x = s.length;
        for(int i=0;i<x/2;i++){
            char temp=s[i];
            s[i] = s[x-1-i];
            s[x-1-i] = temp;
            
        }
    }
}