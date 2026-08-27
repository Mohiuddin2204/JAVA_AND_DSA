package Tree;

public class ChildrenSumProperty {
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
    /* APPROACH : RECURSIVELY GOING DOWN : WE INCREASE NODE VALUES TO MAX OF ALL
    THEN GOING DOWN TO TOP : WE UPDATE PARENTS DATA AS SUM OF ITS CHILDREN
    */
    public static void csp(TNode root){
        if(root==null){return;}
        int c=0;
        if(root.l!=null){c+=root.l.data;}
        if(root.r!=null){c+=root.r.data;}
        if(c>=root.data){root.data=c;}
        else {
            if(root.l!=null){root.l.data=root.data;}
            if(root.r!=null){root.r.data=root.data;}
        }
        csp(root.l); csp(root.r);
        int total=0;
        if(root.l!=null){total+=root.l.data;}
        if(root.r!=null){total+=root.r.data;}
        if(root.l!=null || root.r!=null){root.data=total;}
    }
    public static void main(String[] args) {
        int[] a={40,10,2,-1,-1,5,-1,-1,20,30,-1,-1,40,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    40
                                     10   20
                                   2  5 30  40
        */
        preOrder(root);
        System.out.println();
    csp(root);
    preOrder(root);
    }
}
