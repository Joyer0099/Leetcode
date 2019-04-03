class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        int tag = 1, pos = 0;
        long res = 0;
        if (str.length() > 0) {
            char first = str.charAt(0);
            if (first == '-') {
                tag = -1; pos = 1;
            }
            else if (first == '+')
                pos = 1;
            while (pos < str.length() && Character.isDigit(str.charAt(pos))) {
                res = res * 10 + (str.charAt(pos ++) - '0');
                if (res * tag > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                else if (res * tag < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
        }
        return (int)(res * tag);
    }
}
