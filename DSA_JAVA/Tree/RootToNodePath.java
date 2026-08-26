package Tree;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {
    public static int i=-1;
    public static TNode buildTree(int a[]){
        i++;
        if(a[i]==-1){
            return null;
        }
        TNode newn=new TNode(a[i]);
        newn.l=buildTree(a);
        newn.r=buildTree(a);
        return newn;
    }
    public static List<Integer> rootTonode(TNode root, int x){
        List<Integer> l=new ArrayList<>();
        if(root==null){return l;}
        boolean b=r2n(root,l,x);
        return l;
    }
    // creating boolean helper function , which recursively search for node having value x
    // return true -> if found , otherwise false
    private static boolean r2n(TNode root, List<Integer> l, int x) {
        l.add(root.data);
        if(root.data==x){return true;}
        if((root.l != null && r2n(root.l, l, x))|| (root.r != null && r2n(root.r, l, x))){ return true;}
        l.removeLast();  // as list is mutable , during backtrack(if false) => remove last
        return false;
    }

    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   3
                                   4  5 6  7
        */
        // Path from Node 1 to Node 7 is : 1 3 7
        System.out.println(rootTonode(root,7));
    }
}
