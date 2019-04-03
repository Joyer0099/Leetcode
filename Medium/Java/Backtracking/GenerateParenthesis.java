class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(n, n, "");
        return res;
    }
    
    public void backtrack(int left, int right, String s) {
        if (left <= right) {
            if (left == 0 && right == 0)
                res.add(s);
            else {
                if (left > 0)
                    backtrack(left - 1, right, s + '(');
                if (right > 0)
                    backtrack(left, right - 1, s + ')');
            }
        }
    }
}
