package Tree;

public class IsSymmetric {
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
    public static boolean isSymmetric(TNode root){
        return (root==null)||(iss(root.l,root.r));
    }
    public static boolean iss(TNode left,TNode right){
        if(left==null || right==null){return left==right;}
        if(left.data!=right.data){return false;}
        return iss(left.l,right.r)&&iss(left.r,right.l);
    }
    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,2,5,-1,-1,4,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   2
                                   4  5 5  4
              FORMS A MIRROR OF ITSELF AROUND CENTER
        */
        System.out.println(isSymmetric(root));
    }
}
