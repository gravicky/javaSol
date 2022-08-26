class Solution {
    public int findPeakElement(int[] nums) {
       return findpeak(0,nums.length-1,nums);
    }
    public int findpeak(int st,int end,int[]nums){
        if(st==end)
            return st;
        if(st==end-1)
            if(nums[st]>nums[end])
                return st;
            else
                return end;
        int mid = (end-st)/2 + st;
        if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            return mid;
        else
            if(nums[mid]<nums[mid-1] && nums[mid]>nums[mid+1])
                return findpeak(0,mid-1,nums);
            else
                return findpeak(mid+1,end,nums);
    }
}