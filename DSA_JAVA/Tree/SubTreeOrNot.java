package Tree;

public class SubTreeOrNot {
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
    public static boolean isSubTree(TNode root,TNode subroot){
        if(subroot==null){return true;}
        if(root==null){return false;}
        if(root.data==subroot.data){if(identical(root,subroot)){return true;}}
        return (isSubTree(root.l,subroot))||(isSubTree(root.r,subroot));
    }
    private static boolean identical(TNode root, TNode subroot) {
        if(root==null && subroot==null){return true;}
        if(root==null || subroot==null){return false;}
        if(root.data==subroot.data){
            return (identical(root.l,subroot.l))&&(identical(root.r,subroot.r));
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   3
                                   4  5 6  7
        */
        i=-1;
        int[] a1={2,4,-1,-1,5,-1,-1}; TNode root1=buildTree(a1);
        i=-1;
        int[] a2={3,8,-1,-1,9,-1,-1}; TNode root2=buildTree(a2);
        System.out.println(isSubTree(root,root1));
        System.out.println(isSubTree(root,root2));
    }
}
