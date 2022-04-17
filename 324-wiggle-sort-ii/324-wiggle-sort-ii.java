class Solution {
    public void wiggleSort(int[] nums) {
        int[] cop=Arrays.copyOf(nums,nums.length);
        Arrays.sort(cop);
        int end=cop.length,start=0;
        int left=(end+1)/2-1,right=end-1;
        for(int i=0;i<end;i++){
            if(i%2==1)
                nums[i]=cop[right--];
            else
                nums[i]=cop[left--];
        }
        
    }
}