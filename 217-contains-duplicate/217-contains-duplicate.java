class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet list=new HashSet<>();
        for(int i:nums){
            if(!list.add(i))
                return true;
        }    
            return false;
        }
        
    }