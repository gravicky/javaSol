class Solution {
    int maxlen, start;
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return s;
        for(int i=0;i<s.length()-1;i++){
            
            evaluate(s,i,i);
            evaluate(s,i,i+1);
        }
        return s.substring(start,maxlen+start);
    }
    public void evaluate(String s, int st, int end){
        while(st>=0 && end<s.length() && s.charAt(st)==s.charAt(end)){
            st--;
            end++;
        }
        if(maxlen<end-st-1){
            maxlen=end-st-1;
            start=st+1;
            
        }
            
    }
}