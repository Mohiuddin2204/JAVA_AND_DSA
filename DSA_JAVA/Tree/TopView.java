package Tree;

import java.util.*;

public class TopView {
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
    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,6,-1,-1,-1,3,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :     1
                                     2     3
                                   4    5     7
                                     6
                        LINE     -2 -1  0  1  2
        */
        // TOP VIEW : 4 2 1 3 7   ( can return in any order )
        // using level order traversal and line concept
        // adding the first element of every line ( top view )
        List<Integer> l=new ArrayList<>();
        if(root==null){System.out.println(l);return;}
        // Using treemap as it stores it's keys(int) in sorted order
        TreeMap<Integer,TNode> hm=new TreeMap<>();  // storing line and its first node
        Queue<Pair> q=new LinkedList<>();     // for level order traversal
        q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair p=q.remove();
            TNode n=p.t; int line=p.num;
            if(!hm.containsKey(line)){hm.put(line,n);}
            if(n.l!=null){q.add(new Pair(n.l,line-1));}
            if(n.r!=null){q.add(new Pair(n.r,line+1));}
        }
        for(TNode x:hm.values()){
            l.add(x.data);
        }
        System.out.println(l);
    }
}
