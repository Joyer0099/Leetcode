class Solution(object):
    def coinChange(self, coins, amount):
        """
            :type coins: List[int]
            :type amount: int
            :rtype: int
            """
        if not coins:
            if amount == 0:
                return 0
            return -1
        dp = [0] + [float("inf")] * amount
        coins.sort()
        for i in xrange(1, amount + 1):
            for coin in coins:
                if i >= coin:
                    dp[i] = min(dp[i], dp[i - coin] + 1)
        return dp[amount] if dp[amount] <= amount else -1
