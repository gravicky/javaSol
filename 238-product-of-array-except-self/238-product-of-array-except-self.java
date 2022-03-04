class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] fin=new int[nums.length];
        fin[0]=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            fin[i]=fin[i-1]*nums[i-1];
            
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            fin[i]*=right;
            right*=nums[i];
        }
        return fin;
        
    }
}