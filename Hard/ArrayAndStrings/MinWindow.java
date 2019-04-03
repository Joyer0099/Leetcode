class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length())
            return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c: t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        int left = 0, right = 0, minLeft = 0, minLen = s.length() + 1, count = 0;
        while (right < s.length()) {
            char c = s.charAt(right ++);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) >= 0)
                    count ++;
                while (count == t.length()) {
                    if (right - left < minLen) {
                        minLeft = left;
                        minLen = right - left;
                    }
                    c = s.charAt(left);
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                        if (map.get(c) > 0)
                            count --;
                    }
                    left ++;
                }
            }
        }
        if (minLen > s.length())
            return "";
        return s.substring(minLeft, minLeft + minLen);
    }
}
