class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] chr=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(chr);
        return Arrays.equals(ch,chr);
        
        
    }
}