package StackQueue;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] a={0,1,0,2,1,0,1,3,2,1,2,1};
        // ARRAY CONTAINS HEIGHTS OF BUILDINGS
        // NEED TO CALCULATE AMOUNT OF WATER STORED IN BETWEEN THE BUILDINGS WHEN RAIN FALLS
        // WILL BE USING THE CONCEPT OF min(leftmax,rightmax)-a[i]
        // two pointer approach l-from start , r-from end
        // It means we need to look at smaller sides only
        // at the end , left and right will be at the max building ( as we are exploring smaller ones first)
        int l=0;int r=a.length-1; int lm=0;int rm=0; int total=0;
        while(l<r){
            if(a[l]<=a[r]){
                if(lm>a[l]){total+=lm-a[l];}
                else {lm=a[l];}
                l++;
            }
            /*as left is smaller , explore there : if lm is high , means there is a taller building in left side
            but definitely smaller or equal than right max building */
            else{
                if(rm>a[l]){total+=rm-a[l];}
                else {rm=a[l];}
                r--;
            }
        }
        System.out.println(total);
    }
}
