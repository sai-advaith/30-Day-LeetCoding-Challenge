def maxProfit(prices):
    profit = 0
    for i in range(1,len(prices)):
        if prices[i] > prices[i-1]:
            profit += prices[i] - prices[i-1]
    return profit
print(maxProfit([1,2,3,4,5]))