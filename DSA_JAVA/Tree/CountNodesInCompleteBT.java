package Tree;

public class CountNodesInCompleteBT {
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
    public static int lh(TNode root){
        TNode curr=root; int c=0;
        while (curr!=null){
            c++; curr=curr.l;
        }
        return c;
    }
    public static int rh(TNode root){
        TNode curr=root; int c=0;
        while (curr!=null){
            c++; curr=curr.r;
        }
        return c;
    }
    /* In a BT , if left height and right height are equal then : total nodes are = 2^h -1
    suppose not equal then its => recursively find 1 + left subtree total + right subtree total */
    // TC : O(log n)^2
    public static int cbt(TNode root){
        if(root==null){return 0;}
        int l=lh(root.l);
        int r=rh(root.r);
        if(l==r){return ((1<<(l+1))-1);}
        return 1+cbt(root.l)+cbt(root.r);
    }
    public static void main(String[] args) {
        int[] a={1,2,4,8,-1,-1,9,-1,-1,5,10,-1,-1,11,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :       1
                                      2       3
                                   4    5   6   7
                                8   9 10 11
        */
        System.out.println(cbt(root));
    }
}
