/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(n) && !isBadVersion(n-1))
            return n;
        if(isBadVersion(1))
            return 1;
        int low = 1,high = n-1,mid;
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