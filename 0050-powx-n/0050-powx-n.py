class Solution:
    def myPow(self, x: float, n: int) -> float:
        def power(x: float, n: int) -> float:
            if n == 0:  # Base case: any number to power 0 is 1
                return 1
            
            half = power(x, n // 2)
            if n % 2 == 0:
                return half * half
            else:
                return half * half * x

                
        if n < 0: 
            return 1/power(x, abs(n))
        return power(x,n)
        #return ans
            
        