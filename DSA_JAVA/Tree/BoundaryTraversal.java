package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryTraversal {
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
    public static boolean isLeaf(TNode root){
        return ((root.l==null)&&(root.r==null));
    }
    public static List<Integer> bt(TNode root){
        List<Integer> l=new ArrayList<>();
        if(root==null){return l;}
        if(!isLeaf(root)){l.add(root.data);}
        addLeft(root,l);addLeaf(root,l); addRight(root,l);
        return l;
    }
    // APPROACH IS : FIRST GOING TO THE LEFT BOUNDARY
    // THEN => ADDING ALL LEAVES
    // THEN : ADDING RIGHT BOUNDARY IN REVERSE (USING STACK)
    public static void addLeft(TNode root,List<Integer> l){
        TNode c=root.l;
        while (c!=null){
            if(!isLeaf(c)){l.add(c.data);}
            if(c.l!=null){c=c.l;}
            else{c=c.r;}
        }
    }
    public static void addRight(TNode root,List<Integer> l){
        TNode c=root.r;
        Stack<Integer> st=new Stack<>();
        while (c!=null){
            if(!isLeaf(c)){st.push(c.data);}
            if(c.r!=null){c=c.r;}
            else {c=c.l;}
        }
        while (!st.isEmpty()){
            l.add(st.pop());
        }
    }
    public static void addLeaf(TNode root, List<Integer> l){
        // use preorder for adding leaves
        if(isLeaf(root)){l.add(root.data); return;}
        if(root.l!=null){addLeaf(root.l,l);}
        if(root.r!=null){addLeaf(root.r,l);}
    }
    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   3
                                   4  5 6  7
        */
        // Boundary traversal will be : 1 2 4 5 6 7 3
        System.out.println(bt(root));
    }
}
