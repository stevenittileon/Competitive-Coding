class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        sum1, prod = 0 , 1
        while(n!=0):
            d=n%10
            sum1+=d
            prod*=d
            n=n//10
        return (prod - sum1)

# program to give difference between product of digits and sum of digits