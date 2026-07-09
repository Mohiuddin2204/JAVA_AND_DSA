package Array;
//ELEMENT MORE THAN N/2 TIMES APPEARING IN ARRAY
public class MajorityElement {
    public static void main(String[] args) {
        int[] a={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        //MOORE's VOTING ALGORITHM
        int c=0;int c1=0;int el=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(c==0){
                c=1;
                el=a[i];
            }
            else if(a[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==el){
                c1++;
            }
        }
        if(c1>(a.length/2)){
            System.out.println(el);
        }
        else{
            System.out.println("no majority");
        }
    }
}
