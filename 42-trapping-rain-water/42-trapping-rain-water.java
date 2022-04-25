class Solution {
    public int trap(int[] height) {
        int maxleft=0,maxright=0,left=0,right=height.length-1,total=0;
        if(height==null|| height.length==0)
            return 0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=maxleft)
                    maxleft=height[left];
                else
                    total+=(maxleft-height[left]);
                left++;
            }
            else{
                if(height[right]>=maxright)
                    maxright=height[right];
                else
                    total+=maxright-height[right];
                right--;
            }
        }
        return total;
    }
}