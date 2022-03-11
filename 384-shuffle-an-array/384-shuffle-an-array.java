class Solution {
    private int[] arr;
    private int[] org;

    public Solution(int[] nums) {
        arr=nums;
        org=nums.clone();
        
    }
    
    public int[] reset() {
        arr=org;
        org=org.clone();
    return arr;    
    }
    
    public int[] shuffle() {
        Random r=new Random();
        for(int i=arr.length-1;i>0;i--){
            int j=r.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
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