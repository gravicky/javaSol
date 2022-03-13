class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,max=-1;
        while(right>left){
            max=Math.max(max,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right])
                left++;
                else
                    right--;
       
        
    }
         return max;
        
}
}