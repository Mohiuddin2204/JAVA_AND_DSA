package Recursion;
import java.util.*;
public class Permutations {
    public static void permString(String s, String ns, boolean[] visited) {
        if (ns.length() == s.length()) {
            System.out.print(ns + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;                 // 1. Take
                permString(s, ns + s.charAt(i), visited);
                visited[i] = false;                // 2. Undo (Backtrack)
            }
        }
    }
    public static void permArray(int[] a, List<Integer> l, boolean[] visited) {
        if (l.size() == a.length) {
            System.out.print(l + " ");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!visited[i]) {
                visited[i] = true;                 // 1. Take
                l.add(a[i]);
                permArray(a, l, visited);
                l.removeLast();                     // as list is mutable , remove last and backtrack
                visited[i] = false;                  // 2. Undo (Backtrack)
            }
        }
    }
    // SC : O(1) in bitmask space solution by taking just an integer
    public static void permBitmask(int[] a, List<Integer> l, int mask) {
        if (l.size() == a.length) {
            System.out.print(l + " ");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            // Check if the i-th bit is NOT set (equivalent to !visited[i])
            if ((mask & (1 << i)) == 0) {
                l.add(a[i]); // 1. Take
                // Pass the updated mask with the i-th bit set to 1
                permBitmask(a, l, mask | (1 << i));
                l.removeLast(); // 2. Undo (Backtrack the list)
                // No need to undo the mask because integers are passed by value!
            }
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permString(str, "", new boolean[str.length()]);
        System.out.println();
        int[] a = {1,2,3};
        permArray(a, new ArrayList<>(), new boolean[a.length]);
        System.out.println();
        permBitmask(a,new ArrayList<>(),0);
    }
}