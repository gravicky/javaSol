class Solution {
    public int maxArea(int[] height) {
        int left=0,max=0,right=height.length-1;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            max=Math.max(max,(right-left)*h);
            while(left<right && height[left] <= h ) left++;
            while(left<right && height[right] <= h) right--;
            
        }
        return max;
        
    }
}