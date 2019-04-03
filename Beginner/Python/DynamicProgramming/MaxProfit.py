class Solution(object):
    def maxProfit(self, prices):
        """
            :type prices: List[int]
            :rtype: int
            """
        # Timeout method
        # maxProfile = 0
        # for i in range(len(prices)):
        #     for j in range(i + 1, len(prices)):
        #         maxProfile = max(maxProfile, prices[j] - prices[i])
        # return maxProfile
        
        maxProfit, minPrice = 0, float("inf")
        for price in prices:
            minPrice = min(minPrice, price)
            maxProfit = max(maxProfit, price - minPrice)
        
        return maxProfit
