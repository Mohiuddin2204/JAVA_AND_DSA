package Tree;
import java.util.*;

public class Traversals {
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
    public static void preOrder(TNode root){
        if(root==null){return;}
        System.out.print(root.data+" ");
        preOrder(root.l); preOrder(root.r);
    }
    public static void inOrder(TNode root){
        if(root==null){return;}
        inOrder(root.l); System.out.print(root.data+" "); inOrder(root.r);
    }
    public static void postOrder(TNode root){
        if(root==null){return;}
        postOrder(root.l); postOrder(root.r); System.out.print(root.data+" ");
    }
    public static List<List<Integer>> levelOrder(TNode root){
        List<List<Integer>> l=new ArrayList<>();
        Queue<TNode> q=new LinkedList<>();
        if(root==null){return l;}
        q.add(root);
        while (!q.isEmpty()){
            int length=q.size();
            List<Integer> sl=new ArrayList<>();
            for(int i=0;i<length;i++){
                if(q.peek().l!=null){q.add(q.peek().l);}
                if(q.peek().r!=null){q.add(q.peek().r);}
                sl.add(q.remove().data);
            }
            l.add(sl);
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
        System.out.println(root.data);
        preOrder(root);System.out.println();
        inOrder(root);System.out.println();
        postOrder(root);System.out.println();
        System.out.println(levelOrder(root));

        // PREORDER , POSTORDER , INORDER IN ONE TRAVERSAL
        List<Integer> preorder=new ArrayList<>();
        List<Integer> inorder=new ArrayList<>();
        List<Integer> postorder=new ArrayList<>();
        Stack<Pair> st=new Stack<>();
        // if root==null => return
        st.push(new Pair(root,1));
        // num=1 > preorder -> then go for left , num++
        // num=2 -> inorder -> then for go for right , num++
        // num=3 -> postorder
        while(!st.isEmpty()){
            Pair it=st.pop();
            if(it.num==1){
                preorder.add(it.t.data);
                it.num++;
                st.push(it);
                if(it.t.l!=null){st.push(new Pair(it.t.l,1));}
            }
            else if(it.num==2){
                inorder.add(it.t.data);
                it.num++;
                st.push(it);
                if(it.t.r!=null){st.push(new Pair(it.t.r,1));}
            }
            else {
                postorder.add(it.t.data);
            }
        }
        System.out.println(preorder);
        System.out.println(inorder);
        System.out.println(postorder);
    }
}
