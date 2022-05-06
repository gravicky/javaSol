class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c))
                set.remove(c);
            else
                set.add(c);
        }
        int num=set.size();
        return s.length()-(num==0?0:num-1);
    }
}