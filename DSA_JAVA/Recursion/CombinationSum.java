package Recursion;
import java.util.*;
// ARRAY CONTAINS POSITIVE NUMBERS
// Any NUMBER IN AN ARRAY CAN BE TAKEN ANY NO OF TIMES , SUBSEQUENCE SUM THEN:
public class CombinationSum {
    public static void subseqArray(int[] a, int i, List<Integer> l, int sum, int s){
        // Early pruning: Stop if current sum exceeds target , as array contains positives
        if (s > sum) {
            return;
        }
        // Base case: Reached the end of the array
        if(i == a.length){
            if(s == sum) {
                System.out.print(l + " ");
            }
            return;
        }
        // Choice 1: Take the current element (Stay at index 'i' to allow re-selection)
        int n = a[i];
        l.add(n);
        subseqArray(a, i, l, sum, s + n); // CRITICAL: 'i' stays the same, not 'i + 1'
        l.removeLast();  // Backtrack the mutable list

        // Choice 2: Don't take the current element (Move to the next index 'i + 1')
        subseqArray(a, i + 1, l, sum, s);
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int sum = 3;
        subseqArray(a, 0, new ArrayList<>(), sum, 0);
    }
}
