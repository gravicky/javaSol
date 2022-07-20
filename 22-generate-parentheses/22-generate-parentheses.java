class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new  ArrayList<>();
        if(n==0)
            return res;
        brackets(res, "",n,n);
        return res;
        
    }
    public void brackets(List<String> res, String fix, int left, int right){
        if(left==0 && right==0)
            res.add(fix);
        if(left>0){
            brackets(res,fix+"(",left-1,right);
        }
        if(right>left){
             brackets(res,fix+")",left,right-1);
        }
    }
}