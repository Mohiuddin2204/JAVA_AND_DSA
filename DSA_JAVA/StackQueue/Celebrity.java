package StackQueue;

public class Celebrity {
    public static void main(String[] args) {
        int[][] a={{0,1,1,0},
                {0,0,0,0},
                {0,1,0,0},
                {1,1,0,0}};  int n=a.length;
        //a[0][2]=1 means : person 0 knows 2
        // return person : everyone knows him,  but he knows none
        int t =0; int d =n-1;
        while (t < d){
            if(a[t][d]==1){t++;} // as t cant be celebrity
            else if(a[d][t]==1){d--;} // d cant be celebrity
            else{t++; d--;} // either of t or d can be celebrities
        }
        if(t>d){System.out.println(-1);return;} // no celebrity
        // check for if t is celebrity ( t==d case )
        for(int i=0;i<n;i++){
            if(t==i){continue;}
            if(a[t][i]==0 && a[i][t]==1){continue;}
            else {
                System.out.println(-1);return;
            }
        }
        System.out.println(t);
    }
}
