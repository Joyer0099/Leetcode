class Solution(object):
    def fizzBuzz(self, n):
        """
            :type n: int
            :rtype: List[str]
            """
        L = []
        if n > 0:
            for i in range(1, n + 1):
                string = ''
                if i % 3 == 0:
                    string += 'Fizz'
                if i % 5 == 0:
                    string += 'Buzz'
                if i % 3 != 0 and i % 5 != 0:
                    string += str(i)
                L.append(string)
        return L
