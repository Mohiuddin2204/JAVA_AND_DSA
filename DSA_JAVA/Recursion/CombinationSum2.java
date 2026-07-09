package Recursion;
import java.util.*;
// ARRAY CONTAINS POSITIVE NUMBERS
// PRINT SUBSEQUENCES SUM (UNIQUE ONES)
public class CombinationSum2 {
    public static void subseqArray(int[] a, int i, List<Integer> l, int sum, int s){
        // Early pruning: Since array is sorted and elements are positive,
        if (s > sum) {
            return;
        }
        if (i == a.length) {
            if (s == sum) {
                System.out.print(l + " ");
            }
            return;
        }
        // CHOICE 1: Pick the current element
        int n = a[i];
        l.add(n);
        subseqArray(a, i + 1, l, sum, s + n);
        l.removeLast();  // Backtrack
        // CRITICAL STEP: Skip all identical numbers next to it to avoid duplicates
        while (i + 1 < a.length && a[i] == a[i + 1]) {
            i++;
        }
        // CHOICE 2: Don't pick the current element
        subseqArray(a, i + 1, l, sum, s);
    }
    public static void main(String[] args) {
        int[] a = {2,2,2,2,4}; // Input with multiple duplicates
        int sum = 4;
        // Sorting is mandatory for duplicate skipping logic to work
        Arrays.sort(a);
        subseqArray(a, 0, new ArrayList<>(), sum, 0);
    }
}
