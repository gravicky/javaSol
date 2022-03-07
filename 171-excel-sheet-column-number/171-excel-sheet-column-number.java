class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length()-1;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum*26+(columnTitle.charAt(i)-'A'+1);
        }
        return sum;
        
    }
}