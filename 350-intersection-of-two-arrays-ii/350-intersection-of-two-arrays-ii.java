class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Math.min(nums1.length,nums2.length);
        int[] fin=new int[max];
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int j=0;
        for(int i:nums2){
            if(map.getOrDefault(i,0)>0){
                fin[j++]=i;
                map.put(i,map.get(i)-1);
            }
            
        }
        return Arrays.copyOf(fin, j);
        
    }
}
