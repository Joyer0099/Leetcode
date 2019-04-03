class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins.length < 0)
            return -1;
        int[] res = new int[amount + 1];
        for (int i = 1; i < res.length; i ++)
            res[i] = Integer.MAX_VALUE - 1;
        Arrays.sort(coins);
        for (int i = 1; i < res.length; i ++)
            for (int coin: coins) {
                if (i >= coin)
                    res[i] = Math.min(res[i], res[i - coin] + 1);
            }
        return res[amount] <= amount? res[amount]: -1;
    }
}
