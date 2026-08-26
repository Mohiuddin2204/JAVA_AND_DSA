package Tree;

public class Diameter {
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
    // Longest Path between two nodes (Edges count)
    // Doesn't need to pass via root necessarily
    public static int diameter(TNode root){
        int[] d=new int[1];
        int x=dia(root,d);
        return d[0];
    }
    /* Helper function to find diameter , giving an array to store d as array is mutable ,
        and an integer is immutable => so in recursion, cannot store max height , so taking
          the help of a helper function (making minor changes in height code) */
    private static int dia(TNode root, int[] d) {
        if(root==null){return 0;}
        int lH=dia(root.l,d);
        int rH=dia(root.r,d);
        d[0]=Math.max(d[0],rH+lH);
        return 1+Math.max(lH,rH);
    }

    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :    1
                                     2   3
                                   4  5 6  7
        */
        System.out.println(diameter(root));
    }
}
