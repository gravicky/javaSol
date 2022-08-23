class Solution {
    public int countPrimeSetBits(int left, int right) {
        List<Integer> list = new ArrayList<>(List.of(2,3,5,7,11,13,17,19,23));
        int res = 0;
        for(int i = left;i<=right;i++){
            int n = i;
            int count = 0;
            while(n!=0){
                count+= n&1;
                n>>>=1;
            }
            if(list.contains(count))
                res++;
        }
        
        return res;
    }
}