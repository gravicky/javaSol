class Solution {
    public void rotate(int[] nums, int k) {
        int temp,n=nums.length;
        if(k%n!=0){
        k=k%n;
        int[] arr=new int[k];
        int l=0;
        for(int i=(n-k);i<n;i++){
            arr[l++]=nums[i];
        }
        for(int i=(n-k-1);i>=0;i--){
            nums[i+k]=nums[i];    
        }
        l=0;
        for(int i=0;i<k;i++){
            nums[i]=arr[l++];
        }
    }
        
    }
}