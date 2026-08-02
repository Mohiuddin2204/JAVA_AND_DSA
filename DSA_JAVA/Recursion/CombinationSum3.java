package Recursion;
import java.util.*;
// From numbers 1-9 , return list of k numbers with sum n
public class CombinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, 0, new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(int num, int k, int targetSum, int currentSum, List<Integer> currentList, List<List<Integer>> result) {
        // Pruning as array contains positive numbers
        if (currentSum > targetSum || currentList.size() > k) {
            return;
        }
        // Reached the end of numbers 1-9
        if (num == 10) {
            if (currentSum == targetSum && currentList.size() == k) {
                result.add(new ArrayList<>(currentList)); // Add a snapshot copy of the list
            }
            return;
        }

        // Choice 1: "Don't Take" the current number
        backtrack(num + 1, k, targetSum, currentSum, currentList, result);

        // Choice 2: "Take" the current number
        currentList.add(num);
        currentSum += num;
        backtrack(num + 1, k, targetSum, currentSum, currentList, result);
        currentSum -= num;
        currentList.removeLast();
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
}
