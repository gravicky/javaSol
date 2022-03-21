public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if(n==0)
            return 0;
        int result=0;
        for(int i=0;i<32;i++){
            int end=n&1;
            result<<=1;
            result|=end;
            n>>=1;
        }
        return result;
    }
}