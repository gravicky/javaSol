class Solution {
    public int myAtoi(String s) {
        int i=0,n=s.length(),sign=1,total=0;
        if(n==0)
            return 0;
        while(i<n && s.charAt(i)==' ')
            i++;
        if(i==n)
            return 0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else
            if(s.charAt(i)=='+')
                i++;
        while(i<n){
            int dig=s.charAt(i)-'0';
            if(dig<0 || dig>9)
                break;
            if(Integer.MAX_VALUE/10<total || (Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10<dig))
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            total=total*10+dig;
            i++;
        }
        return total*sign;
        
        
    }
}