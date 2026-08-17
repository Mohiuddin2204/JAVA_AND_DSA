package Tree;

public class CountSumHeight {
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
    public static int count(TNode root){
        if(root==null){return 0;}
        int lN=count(root.l);
        int rN=count(root.r);
        return lN+rN+1;
    }
    public static int sum(TNode root){
        if(root==null){return 0;}
        int lN=sum(root.l);
        int rN=sum(root.r);
        return lN+rN+root.data;
    }
    public static int height(TNode root){
        if(root==null){return 0;}
        int lH=height(root.l);
        int rH=height(root.r);
        return Math.max(lH,rH)+1;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   3
                                   4  5 6  7
        */
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(height(root));
    }
}
