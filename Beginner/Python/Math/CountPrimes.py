from math import sqrt
class Solution(object):
    def countPrimes(self, n):
        """
            :type n: int
            :rtype: int
            """
        if n <= 2:
            return 0
        if n == 3:
            return 1
        if n <= 5:
            return 2
        # Prime greater than 5 is next to multiple of 6
        time = n / 6
        primes = 2
        for i in range(1, time + 1):
            if self.isPrime(i * 6 - 1):
                primes += 1
            number = i * 6 + 1
            if n > number and self.isPrime(number):
                primes += 1
        return primes
    
    def isPrime(self, num):
        if num % 2 == 0:
            return False
        for i in range(3, int(sqrt(num)) + 1, 2):
            if num % i == 0:
                return False
        return True
