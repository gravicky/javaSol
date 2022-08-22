class Solution {
    public int findComplement(int num) {
        int res = 0;
        while(res<num){
            res<<=1;
            res|=1;
        }
        return res-num;
        
    }
}