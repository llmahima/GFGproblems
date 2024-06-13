#User function Template for python3

class Solution:
    def padovanSequence(self, n):
            # code here 
        m=1000000007
        if n<=2:
            return 1
        else:
            a,b,c=1,1,1
            d=0
            for i in range(3,n+1):
                d=(a%m+b%m)%m
                a,b,c=b,c,d
        return d


        # code here 


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())
        ob = Solution()
        print(ob.padovanSequence(n))

# } Driver Code Ends