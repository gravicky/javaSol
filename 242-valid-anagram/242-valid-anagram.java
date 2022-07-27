class Solution {
    public boolean isAnagram(String s, String t) {
        int x = s.length(), y = t.length();
        if(x!=y)
            return false;
        int[] val = new int[26];
        for(int i = 0;i<x;i++){
            val[s.charAt(i)-'a']++;
        }
    for(int i=0;i<x;i++){
            val[t.charAt(i)-'a']--;
            if(val[t.charAt(i)-'a']<0)
                return false;
        }
    for(int i=0;i<26;i++){
        if(val[i]!=0)
            return false;
    }
    return true;

    }
}