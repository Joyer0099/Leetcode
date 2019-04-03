class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        return happyPow(set, n) == 1? true: false;
    }
    
    public int happyPow(Set<Integer> set, int n) {
        int res = 0;
        while (n != 0) {
            res += Math.pow(n % 10, 2);
            n /= 10;
        }
        if (!set.contains(res)) {
            set.add(res);
            res = happyPow(set, res);
        }
        return res;
    }
}
