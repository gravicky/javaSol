class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0,fin1=nums1.length,fin2=nums2.length;
        int[] res = new int[fin1+fin2];
        while(i<fin1 && j<fin2){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i];
                i++;
            }
            else{
                res[k++]=nums2[j];
                j++;
            }
        }
        while(i<fin1)
            res[k++]=nums1[i++];
        while(j<fin2)
            res[k++]=nums2[j++];
        double ret;
        if(res.length%2!=0)
            ret=res[(int)res.length/2];
        else
            ret=(res[(int)res.length/2]+res[(int)res.length/2-1])/2.0;
        return ret;
            
        
    }
}