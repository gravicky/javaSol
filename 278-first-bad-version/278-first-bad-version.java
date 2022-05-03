/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0,high = n,mid;
        while(high>=low){
            mid = low + (high-low)/2;
            if(!isBadVersion(mid) && isBadVersion(mid+1))
                return mid+1;
            if(!isBadVersion(mid))
                low = mid+1;
            else
                high = mid-1;
        }
     return 0;  
    }
}