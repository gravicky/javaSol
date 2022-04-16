class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] cache=new int[256];
        int result=0;
        for(int i=0,j=0;i<s.length();i++){
            if(cache[s.charAt(i)]>0){
                j=Math.max(j,cache[s.charAt(i)]);
            }
            cache[s.charAt(i)]=i+1;
            result=Math.max(result,i-j+1);
        }
        return result;
    }
    
    
}
