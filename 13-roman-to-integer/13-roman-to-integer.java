class Solution {
   
    public int romanToInt(String s) {
       
     
        int sum=0;
        for(int i=0;i<s.length();i++)
            if((i<s.length()-1)&&(value(s.charAt(i))<value(s.charAt(i+1))))
            {
                sum=sum+value(s.charAt(i+1))-value(s.charAt(i));
                i++;
            }
        
         else
            sum=sum+value(s.charAt(i));
     return sum;   
    }
     public static int value(char c){
            if(c=='I')
                return 1;
              if(c=='V')
                return 5;
              if(c=='X')
                return 10;
              if(c=='L')
                return 50;
              if(c=='C')
                return 100;
              if(c=='D')
                return 500;
              if(c=='M')
                return 1000;
         return 0;
        }
}