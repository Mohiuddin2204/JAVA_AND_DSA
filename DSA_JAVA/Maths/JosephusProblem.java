package Maths;

public class JosephusProblem {
    //WINNER OF CIRCULAR GAME , N= NO OF PERSONS , K= Kth person gets lost in a circular manner
    // N=5 , K=2 :  START FROM 1=>2(LOST AND REMOVE)
    // NEXT 3=>4(LOST) => 5=>1(LOST) => 3=>5(LOST)
    // WINNER IS 3
    // THERE IS A PATTERN IN THIS GAME : CAN BE SOLVED THROUGH RECURSION (JOSEPHUS)
    public static int wCG(int n,int k){  //0 based indexing
        if(n==1){return 0;}
        return (wCG(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        int n=5;int k=2;
        System.out.println(wCG(n,k)+1); // as it is 0 based indexing (add 1)
    }
}
