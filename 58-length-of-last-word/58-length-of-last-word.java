class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0)
            return 0;
        int a = (s.length()-1), part=0;
        while(s.charAt(a)==' ')
            a--;
        for(int i=0;i<=a;i++)
            if(s.charAt(i)==' ')
                part=i+1;
        return (a+1-part);
        
    }
    
}