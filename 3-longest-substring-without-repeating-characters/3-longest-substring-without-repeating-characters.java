class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); 
        int i=0,max=Integer.MIN_VALUE,count=0;
        if(s.length()==0)
            return 0;
        while(i<s.length()){
            if(set.add(s.charAt(i))){
                count++;
            }
            else{
                max=Math.max(max,count);
                int j=i-1;
                while(s.charAt(j)!=s.charAt(i))
                    j--;
                i=j;
                count=0;
                set.clear();
            }
            i++; 
        }
        max=Math.max(max,count);
        return max;
    }
}
