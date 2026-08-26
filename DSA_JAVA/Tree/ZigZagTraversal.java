package Tree;
import java.util.*;

public class ZigZagTraversal {
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
    public static List<List<Integer>> zigzag(TNode root){
        List<List<Integer>> l=new ArrayList<>();
        if(root==null){return l;}
        Queue<TNode> q=new LinkedList<>();
        boolean f=false;// indicating L-R
        q.add(root);
        while (!q.isEmpty()){
            int s=q.size();
            List<Integer> sl=new ArrayList<>();
            for(int i=0;i<s;i++){
                if(q.peek().l!=null){q.add(q.peek().l);}
                if(q.peek().r!=null){q.add(q.peek().r);}
                if(f){sl.addFirst(q.remove().data);} // If flag is true : R-L
                else {sl.addLast(q.remove().data);} // If flag is false : L-R
            }
            f=!f; l.add(sl);
        }
        return l;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   3
                                   4  5 6  7
        */
        // zig traversal => 1 (L-R) , 3 2 (R-L) ,  4 5 6 7 (L-R) .....
        System.out.println(zigzag(root));
    }
}
