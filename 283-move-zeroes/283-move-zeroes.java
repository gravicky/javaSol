class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,k=1;
        
        while(i<(nums.length-k))
            if(nums[i]==0){
                k++;
                for(int j=i;j<nums.length-1;j++)
                    nums[j]=nums[j+1];
                nums[nums.length-1]=0;
            }
        else
            i++;
        
    }
}