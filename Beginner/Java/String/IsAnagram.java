class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] sc = new int[26];
        int[] st = new int[26];
        for (int i = 0; i < s.length(); i ++) {
            sc[s.charAt(i) - 'a'] ++;
            st[t.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < 26; i ++)
            if(sc[i] != st[i])
                return false;
        return true;
    }
}
