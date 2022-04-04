class Solution {
    public int evalRPN(String[] tokens) {
Stack<Integer> stack = new Stack<Integer>();
        int k=tokens.length;
  
  for (int i = 0; i < k; i++) {
    switch (tokens[i]) {
      case "+":
        stack.push(stack.pop() + stack.pop());
        break;
          
      case "-":
        stack.push(-stack.pop() + stack.pop());
        break;
          
      case "*":
        stack.push(stack.pop() * stack.pop());
        break;

      case "/":
        int n1 = stack.pop();
            int n2 = stack.pop();
        stack.push(n2 / n1);
        break;
          
      default:
        stack.push(Integer.parseInt(tokens[i]));
    }
  }
  
  return stack.pop();
}
}