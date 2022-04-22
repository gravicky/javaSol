class Solution {
    public void sortColors(int[] nums) {
        int start=0,fin=nums.length-1,temp,i=0;
        while(i<=fin){        
            if(nums[i]==0){
                temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                start++;
            }
            if(nums[i]==2){
                temp=nums[i];
                nums[i]=nums[fin];
                nums[fin]=temp;
                fin--;
                i--;
            }
            i++;
        }
        
        
    }
}