package Tree;

public class LCA {
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
    // LOWEST COMMON ANCESTOR
    // IF BOTH ARE IN SAME PATH , THEN RETURN NODE WHICH IS CLOSER TO ROOT
    // APPROACH IS : WE ARE GOING TO SEARCH FOR BOTH NODES
    // IF WE GET ANY OF THEM -> RECURSIVELY GO BACK
    // THEN FOR ANCESTORS : IF LEFT GIVES A DATA AND RIGHT GIVES NULL -> RETURN DATA
    // IF AN ANCESTOR GETS : BOTH LEFT AND RIGHT AS SOME DATA THEN RETURN IT -> AS IT IS LCA
    public static TNode lca(TNode root,TNode p,TNode q){
        if(root==null || root==p ||root==q){return root;} // finding p or q : base case
        TNode l=lca(root.l,p,q);
        TNode r=lca(root.r,p,q);
        if(l==null){return r;}      // going back cases
        else if(r==null){return l;}
        return root;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   3
                                   4  5 6  7
        */
        System.out.println(lca(root,root.l,root.r.l).data); // lca(2,6)= 1
        System.out.println(lca(root,root.l,root.l.r).data); // lca(2,5) = 2
    }
}
