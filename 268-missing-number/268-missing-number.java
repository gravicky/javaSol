class Solution {
    public int missingNumber(int[] nums) {
        HashSet map=new HashSet<>(nums.length);
        if(nums==null)
            return 0;
        int max=nums[0],min=nums[0];
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int k=min+1;
        while(k<max){
            if(!map.contains(k))
                return k;
            k++;
        }
        
        if(min==0)
            return (max+1);
        else
            return (min-1);
}
}