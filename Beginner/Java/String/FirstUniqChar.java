class Solution {
    public int firstUniqChar(String s) {
        int[] c = new int[26];
        int minPos = s.length();
        for(int i = 0; i < s.length(); i ++)
            c[s.charAt(i) - 'a'] ++;
        for(int i = 0; i < 26; i ++)
            if(c[i] == 1)
                minPos = Math.min(minPos, s.indexOf(i + 'a'));
        if (minPos == s.length())
            return -1;
        return minPos;
    }
}
