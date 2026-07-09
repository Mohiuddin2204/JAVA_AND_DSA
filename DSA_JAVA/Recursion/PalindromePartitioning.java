package Recursion;
import java.util.*;
public class PalindromePartitioning {
    public static boolean isPalindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return isPalindrome(s, i + 1);
    }
    public static void partition(String s, int i, String currentPart, List<String> l) {
        // Base Case: Reached the end of the string
        if (i == s.length()) {
            // If we reached the end and our final part is a palindrome,
            // the entire partition strategy is valid.
            if (!currentPart.isEmpty() && isPalindrome(currentPart, 0)) {
                l.add(currentPart);
                System.out.println(l);
                l.removeLast(); // Backtrack
            }
            return;
        }
        // Grow the current substring by taking the character at index i
        String nextPart = currentPart + s.charAt(i);

        // if the substring we just completed is a palindrome: Cut here (Take the partition point)
        if (isPalindrome(nextPart, 0)) {
            l.add(nextPart);
            // Move to next index with a fresh, empty string for the next partition
            partition(s, i + 1, "", l);
            l.removeLast(); // Backtrack
        }

        // Do NOT Cut here , as it was not palindrome part
        partition(s, i + 1, nextPart, l);
    }
    public static void main(String[] args) {
        String str="aabb";
        partition(str,0,"",new ArrayList<>());
    }
}
