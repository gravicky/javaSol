class Solution {
    public String countAndSay(int n) {
        String s="1";
        int i=2;
        while(i<=n){
            String temp="";
            int j=0,len=s.length();
            while(j<len){
                int count=1;
                while((j<len-1) && s.charAt(j)==s.charAt(j+1)){
                    count++;
                    j++;
                }
                temp=temp+count+s.charAt(j);
                j++;
            }
            s=new String(temp);
            i++;
        }
        return s;
        
    }
}