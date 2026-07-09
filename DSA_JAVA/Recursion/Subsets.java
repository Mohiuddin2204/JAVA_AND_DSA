package Recursion;
import java.util.*;

public class Subsets {
    public static void subset(int[] a, int i, List<Integer> l, boolean hasStarted) {
        // Base case: Reached the end of the array
        if (i == a.length) {
            System.out.print(l + " ");
            return;
        }
        if (!hasStarted) {
            // SCENARIO A: We haven't started picking yet
            // Choice 1: Not-Take (Skip the current element completely)
            subset(a, i + 1, l, false);

            // Choice 2: Take (Start our contiguous subarray here)
            l.add(a[i]);
            subset(a, i + 1, l, true);
            l.removeLast(); // Backtrack

        } else {
            // SCENARIO B: We are actively building a contiguous subarray
            // Choice 1: Take (Must take consecutive elements to keep it contiguous)
            l.add(a[i]);
            subset(a, i + 1, l, true);
            l.removeLast(); // Backtrack

            // Choice 2: Not-Take (Stop right here! Print the finished subarray)
            System.out.print(l + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        subset(a, 0, new ArrayList<>(), false);
    }
}
