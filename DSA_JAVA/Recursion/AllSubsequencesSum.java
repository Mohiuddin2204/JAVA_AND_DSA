package Recursion;

public class AllSubsequencesSum {
    // Optimal Solution: Sum is calculated on the go using the 'currentSum' variable
    public static void subseqSum(int[] a, int i, int currentSum) {
        if (i == a.length) {
            System.out.print(currentSum + " ");
            return;
        }
        // Choice 1: Don't pick the current element (Sum remains the same)
        subseqSum(a, i + 1, currentSum);
        // Choice 2: Pick the current element (Add its value to currentSum)
        subseqSum(a, i + 1, currentSum + a[i]);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println("Subsequence Sums ");
        subseqSum(a, 0, 0);
    }
}
