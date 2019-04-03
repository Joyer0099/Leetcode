class Solution {
    public int calculate(String s) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        char opt = '+';
        int num = 0;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = num * 10 + c - '0';
            if ((c != ' ' && !Character.isDigit(c)) || i == s.length() - 1) {
                if (opt == '-')
                    num = - num;
                else if (opt == '*')
                    num *= stack.pop();
                else if (opt == '/')
                    num = stack.pop() / num;
                stack.push(num);
                num = 0;
                opt = c;
            }
        }
        while (!stack.isEmpty())
            res += stack.pop();
        return res;
    }
}
