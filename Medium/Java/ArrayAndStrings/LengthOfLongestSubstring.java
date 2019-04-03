class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2)
            return s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        int start = 0, maxLength = 0;
        for (int i = 0; i < s.length(); i ++) {
            char temp = s.charAt(i);
            if (hm.containsKey(temp) && start <= hm.get(temp))
                start = hm.get(temp) + 1;
            else
                maxLength = Math.max(maxLength, i - start + 1);
            hm.put(temp, i);
        }
        return maxLength;
    }
}
