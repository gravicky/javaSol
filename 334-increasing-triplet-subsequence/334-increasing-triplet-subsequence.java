class Solution {
    public boolean increasingTriplet(int[] nums) {
        int num1=Integer.MAX_VALUE,num2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(num1>=nums[i]) num1=nums[i];
            else
                if(num2>=nums[i]) num2=nums[i];
            else
                return true;
        }
        return false;
        
    }
}