package Tree;
import java.util.*;
import java.lang.*;

public class NodesAtDistanceK {
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
    public static void parents(TNode root,HashMap<TNode,TNode> p,TNode target){
        Queue<TNode> q =new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TNode curr= q.remove();
            if(curr.l!=null){
                p.put(curr.l,curr);
                q.add(curr.l);
            }
            if(curr.r!=null){
                p.put(curr.r,curr);
                q.add(curr.r);
            }
        }
    }
    // GIVEN PROBLEM : FROM THE GIVEN TARGET NODE => PRINT THE NODES WHICH ARE AT A DISTANCE K
    // FIRST OF ALL STORING PARENTS OF EACH NODE IN HASHMAP THROUGH BFS: LEVEL ORDER TRAVERSAL
    /* NOW STARTING FROM TARGET WE WILL BE DOING DFS TRAVERSAL STARTING FROM TARGET AND NOTING DOWN
    THE DISTANCE => MAINTAINING VISITED HASH FOR ALREADY VISITED NODES , QUEUE FOR MAINTAINING NODES WHICH
    ARE AT A DISTANCE D FROM THE TARGET -> LOOP UNTIL WE REACH D=K (GIVEN)
    */
    public static List<Integer> distk(TNode root,TNode target,int k){
        List<Integer> ans=new ArrayList<>(); if(root==null){return ans;} // returning empty list for empty tree case
        HashMap<TNode,TNode> p=new HashMap<>();  // parents map
        parents(root,p,target);
        HashMap<TNode,Boolean> visitedhash=new HashMap<>();  // as performing dfs => maintaining visited hash
        Queue<TNode> q=new LinkedList<>();
        q.add(target);
        visitedhash.put(target,true); // starting with given target till dist k
        int d=0;
        while (!q.isEmpty()){
            int s=q.size();
            if(d==k){break;}
            d++;
            for(int i=0;i<s;i++){
                TNode curr=q.remove();
                if(curr.l!=null && visitedhash.get(curr.l)==null){
                    q.add(curr.l); visitedhash.put(curr.l,true);
                }
                if(curr.r!=null && visitedhash.get(curr.r)==null){
                    q.add(curr.r); visitedhash.put(curr.r,true);
                }
                if(p.get(curr)!=null && visitedhash.get(p.get(curr))==null){
                    q.add(p.get(curr)); visitedhash.put(p.get(curr),true);
                }
            }
        }
        while (!q.isEmpty()){
            ans.add(q.remove().data);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={3,5,6,-1,-1,2,7,-1,-1,4,-1,-1,1,0,-1,-1,8,-1,-1};
        TNode root=buildTree(a);
        /* TREE STRUCTURE IS LIKE :     3
                                      5    1
                                   6   2  0  8
                                      7 4
        */
        List<Integer> l=distk(root,root.l,2);
        System.out.println(l);
    }
}
