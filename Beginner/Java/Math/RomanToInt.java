class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0)
            return 0;
        String symbol = new String("IVXLCDM");
        Integer[] value = {1, 5, 10, 50, 100, 500, 1000};
        int res = 0;
        for (int i = 0; i < s.length() - 1; i ++) {
            int psCur = symbol.indexOf(s.charAt(i));
            int psAft = symbol.indexOf(s.charAt(i + 1));
            if (psCur >= psAft)
                res += value[psCur];
            else
                res -= value[psCur];
        }
        return res + value[symbol.indexOf(s.charAt(s.length() - 1))];
    }
}
