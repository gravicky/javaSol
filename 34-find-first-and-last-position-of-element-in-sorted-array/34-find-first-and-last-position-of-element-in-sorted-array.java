class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0,mid,end=nums.length-1;
        int[] arr={-1,-1};
        while(end>=start){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                int mid1=mid;
                while(mid-1>=0 && nums[mid-1]==target)
                    mid--;
                arr[0]=mid;
                while(mid1+1<nums.length && nums[mid1+1]==target)
                    mid1++;
                arr[1]=mid1;
                return arr;
            }
            else
                if(target<nums[mid])
                    end=mid-1;
            else
                start=mid+1;
            
        }
        return arr;
        
    }
}