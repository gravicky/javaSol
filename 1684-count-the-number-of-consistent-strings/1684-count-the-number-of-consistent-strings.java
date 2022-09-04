class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int all[] = new int[26];
        for(int i=0;i<26;i++){
            all[i] = 0;
        }
        for(int i =0;i<allowed.length();i++){
            all[allowed.charAt(i)-'a']++;
            
        }
        int count=0;
        for(String s:words){
            int i =0;
            for(i=0;i<s.length();i++){
                if(all[s.charAt(i)-'a']==0)
                    break;
                
            }
            if(i==s.length())
                count++;
        }
        return count;
    }
}