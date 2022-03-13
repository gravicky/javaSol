class Solution {
    public int maxArea(int[] height) {
    int max=0, left=0, right=height.length-1;
    while (left < right) {
        int h = Math.min(height[left], height[right]);
        max = Math.max(max, (right-left) * h);

        while (height[left] <= h && left < right) left++;
        while (height[right] <= h && left < right) right--;
    }
    return max;
}
}