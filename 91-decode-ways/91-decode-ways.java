class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0 )
            return 0;
        int[] dp=new int[s.length()];
        dp[0]=s.charAt(0)=='0'?0:1;
        for(int i=1;i<s.length();i++){
            int cur=s.charAt(i)-'0';
            int fin=(s.charAt(i-1)-'0')*10+cur;
            if(cur!=0)
                dp[i]+=dp[i-1];
            if(fin>=10 && fin<=26)
                dp[i]+=i>=2?dp[i-2]:1;
        }
        return dp[s.length()-1];
        
    }
}