package BitManipulation;
import java.util.Arrays;

// In an array , there is a number repeating once, remaining all thrice
public class SingleNumberII {
    public static void main(String[] args) {
        int[] a={2,7,2,1,7,7,2};
        //complicated but most optimal solution
        int ones=0; int twos=0;
        for(int i=0;i<a.length;i++){
            //placing in 1s, if not in 2s
            ones=(ones^a[i])&(~twos);
            //placing in 2s , if it was in 1s by dropping and adding
            twos=(twos^a[i])&(~ones);
        }
        System.out.println(ones);

        //Sorting technique , optimal solution
        Arrays.sort(a);
        for(int i=1;i<a.length;i+=3){
            if(a[i]!=a[i-1]){
                System.out.println(a[i-1]);
                return;
            }
        }
        System.out.println(a[a.length-1]); // if last element is single
    }
}
