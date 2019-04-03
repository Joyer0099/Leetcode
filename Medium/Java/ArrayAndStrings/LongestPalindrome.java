class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i ++) {
            //             find palindrome like 'aba'
            int[] temp = findPalindrome(s, i, i);
            if (temp[1] - temp[0] > res.length())
                res = s.substring(temp[0], temp[1]);
            
            //             find palindrome like 'abba'
            temp = findPalindrome(s, i, i + 1);
            if (temp[1] - temp[0] > res.length())
                res = s.substring(temp[0], temp[1]);
        }
        return res;
    }
    
    public int[] findPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l --; r ++;
        }
        int[] res = {l + 1, r};
        return res;
    }
}
