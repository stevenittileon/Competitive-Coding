class Solution:
    def fib(self, n: int) -> int:
        if n==1:
            return 1
        if n == 0:
            return 0
        else:
            fib = [0, 1]
            for i in range(2, n+1):
                fib.append(fib[i-1]+fib[i-2])
        return fib[n]

# to do without recursion and make it faster