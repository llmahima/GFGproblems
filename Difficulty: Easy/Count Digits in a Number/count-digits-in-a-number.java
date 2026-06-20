class Solution {
    public static int countDigits(int n) {
        // Code here
        int count =0;
        while (n>0){
            int num = n%10;
            count = count+1;
            n = n/10;
        }
        return count;
    }
}
