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
    public static void main(String[] args) {
        String str = "ABC";
        permString(str, "", new boolean[str.length()]);
        System.out.println();
        int[] a = {1,2,3};
        permArray(a, new ArrayList<>(), new boolean[a.length]);
    }
}