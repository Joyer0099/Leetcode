class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (String token: tokens) {
            if (!("+-*/").contains(token))
                stack.push(Integer.valueOf(token));
            else {
                int opt2 = stack.pop(), opt1 = stack.pop();
                if (token.equals("+"))
                    opt1 += opt2;
                else if (token.equals("-"))
                    opt1 -= opt2;
                else if (token.equals("*"))
                    opt1 *= opt2;
                else if (token.equals("/"))
                    opt1 /= opt2;
                stack.push(opt1);
            }
        }
        return stack.pop();
    }
}
