#User function Template for python3
class Solution:
	def printString(self, s, ch, count):
		idx = -1
		for i in range(len(s)):
		    if s[i] == ch and count>0:
		        idx = i
		        count-=1
		if idx == -1 or count>0:
		    return ""
	    return s[idx+1:]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        s = input()
        ch = input()[0]
        count = int(input())
        ob = Solution()
        answer = ob.printString(s, ch, count)

        print(answer)

# } Driver Code Ends