class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1)
            for(int j:nums2){
                int sum=i+j;
                map.put(sum,map.getOrDefault(sum,0)+1);
                
            }
        int ret=0;
        for(int i:nums3)
            for(int j:nums4){
                int sum=-i-j;
                ret+=map.getOrDefault(sum,0);
            }
        return ret;
    }
}