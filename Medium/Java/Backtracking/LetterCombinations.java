class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mapping =
        new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        
        //         Iteration
        // if (digits.length() != 0) {
        //     res.add("");
        //     for (int i = 0; i < digits.length(); i ++) {
        //         List<String> temp = new ArrayList<>();
        //         for (char c: mapping[digits.charAt(i) - '0'].toCharArray()) {
        //             for (int j = 0; j < res.size(); j ++) {
        //                 String ans = res.get(j);
        //                 temp.add(ans + c);
        //             }
        //         }
        //         res = temp;
        //     }
        // }
        
        //         Recursion
        if (digits.length() != 0) {
            for (char c: mapping[digits.charAt(digits.length() - 1) - '0'].toCharArray())
                if (digits.length() == 1)
                    res.add("" + c);
                else
                    for (String s: letterCombinations(digits.substring(0, digits.length() - 1)))
                        res.add(s + c);
        }
        return res;
    }
}
