class Solution {
    public void reverseString(char[] s) {
        int x = s.length-1,w=0;
        while(w<x){
            char temp=s[w];
            s[w] = s[x];
            s[x] = temp;
            w++;
            x--;
        }
    }
}