class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        Map<Long, Integer> remainders = new HashMap<>();
        StringBuilder fractions = new StringBuilder();
        long nmt = numerator, dmt = denominator;
        String tag = nmt * dmt > 0? "": "-";
        nmt = Math.abs(nmt); dmt = Math.abs(dmt);
        String integer = String.valueOf(nmt / dmt);
        nmt = nmt % dmt * 10;
        while (nmt != 0) {
            if (remainders.containsKey(nmt)) {
                int pos = remainders.get(nmt);
                return tag + integer + "."  + fractions.substring(0, pos)
                + "(" + fractions.substring(pos) + ")";
            }
            remainders.put(nmt, fractions.length());
            fractions.append(nmt / dmt);
            nmt = nmt % dmt * 10;
        }
        if (fractions.length() == 0)
            return integer.equals("0")? integer: tag + integer;
        return tag + integer + "." + fractions.toString();
    }
}
