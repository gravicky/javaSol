class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i=0;i<bucket.length;i++)
            bucket[i] = new ArrayList<>();
        for(int l:map.keySet()){
            bucket[map.get(l)].add(l);            
        }
        int[] res = new int[k];
        int x=0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            for(int z:bucket[i]){
                res[x++] = z;
                if (x >= k) return res;
            }
        }
        return res;
    }
}