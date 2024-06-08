//{ Driver Code Starts
import java.util.*;

class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(n, a, b));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
   public int findExtra(int n, int arr1[], int arr2[]) {
        int n2=arr2.length;
        
        int i=0;
        int j=0;
        int ind=-1;
        while(i<n  && j<n2){
            if(arr1[i]!=arr2[j])
            {
                ind=i;
                break;
            }
            i++;
            j++;
        }
        if(ind==-1){
            if(j==n2){
                return n-1;
            }
        }
        return ind;
    }
}