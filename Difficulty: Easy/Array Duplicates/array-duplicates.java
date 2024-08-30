//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.duplicates(arr);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int count = 0, arrLength = arr.length;
        outerloop:
        for (int i = 0; i < arrLength; i++) {
            count = 0;
            for (int j = 0; j < arrLength; j++) {
                if (i==arr[j]) {
                    count += 1;
                }
            }
            if (count > 1) {
                arr2.add(i);
            }
        }
        if ((!arr2.isEmpty())){
            return arr2;
        }
        else {
            arr2.add(-1);
            return arr2;
        }
    }
}
