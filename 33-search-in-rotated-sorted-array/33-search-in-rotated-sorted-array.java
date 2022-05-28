class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid;
        while(high>low){
            mid=low+(high-low)/2;
            if(nums[mid]>nums[high])
                low=mid+1;
            else
                high=mid;
        }
        int start=low;
        if(target>nums[nums.length-1]){
            low=0;
            high=start-1;
        }
        else
        {
            low=start;
            high=nums.length-1;
        }
        while(high>=low){
            mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}