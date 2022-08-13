class Solution {
    private int[] arr;
    private int[] ran;

    public Solution(int[] nums) {
        arr = nums;
        ran = arr.clone();
        
    }
    
    public int[] reset() {
        arr = ran.clone();
        return arr;
    }
    
    public int[] shuffle() {
        Random r = new Random();
        for(int i=arr.length-1;i>=0;i--){
            int j = r.nextInt(i+1);
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */