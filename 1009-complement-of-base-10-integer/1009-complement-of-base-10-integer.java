class Solution {
    public int bitwiseComplement(int n) {
        int x = 0;
        do{ 
            x<<=1;
            x|=1;
            
            }while(n>x);
        return x-n;
    }
}