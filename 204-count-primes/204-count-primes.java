class Solution {
    public int countPrimes(int n) {
        boolean[] boo=new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(boo[i]==false){
                count++;
                for(int j=2;i*j<n;j++){
                    boo[i*j]=true;
                }
            }
        }
        return count;
    }
}