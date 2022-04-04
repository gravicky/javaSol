class Solution {
    public boolean isPalindrome(String s) {
        int y=s.length()-1;
        int x=0;
        char[] arr=s.toCharArray();
        while(x<y){
            while(x<y && !(Character.isLetter(arr[x]) || Character.isDigit(arr[x]))){
                x++;
            }
            while(x<y && !(Character.isLetter(arr[y]) || Character.isDigit(arr[y])))
                y--;
            if(x<y && Character.toLowerCase(arr[x])!=Character.toLowerCase(arr[y]))
                return false;
            x++;
            y--;
            
        }
        return true;
    }
}