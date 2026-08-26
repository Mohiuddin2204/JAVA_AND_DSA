package Tree;

public class BalancedBT {
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
    public static int bbt(TNode root){
        if(root==null){return 0;}
        int lH=bbt(root.l);
        if(lH==-1){return -1;}
        int rH=bbt(root.r);
        if(rH==-1){return -1;}
        if(Math.abs(lH-rH)>1){return -1;}
        return Math.max(lH,rH)+1;
    }
    // For every node condition must be : [height(left)-height(right)] <= 1
    /* Similar to checking height code , for any node if any moment :
              Math.abs[ h(l)-h(r) ]> 1   =>  return -1 */
    public static boolean checkbbt(TNode root){
        return bbt(root)!=-1;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   3
                                   4  5 6  7
        */
        System.out.println(checkbbt(root));
    }
}
