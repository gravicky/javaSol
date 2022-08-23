class Solution {
    public int hammingDistance(int x, int y) {
        x ^= y;
        int res = 0;
        while(x!=0){
            res += x&1;
            x>>=1;
        }
        return res;
    }
}