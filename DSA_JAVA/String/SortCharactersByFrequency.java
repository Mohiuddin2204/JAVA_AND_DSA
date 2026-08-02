package String;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    //Using priority Queue for sorting
    public static void main(String[] args) {
        String s="acAbBABaca";
        HashMap<Character,Integer> hm=new HashMap<>();
        PriorityQueue<Character> p=new PriorityQueue<>((x,y)-> hm.get(y)-hm.get(x));
        // Representing max priority queue :
        //if x have high value , result will be negative , x comes first
        //if x have lower value , result will be positive , x comes after y
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:hm.keySet()){
            p.offer(c);
        }
        StringBuilder sb=new StringBuilder();
        while(!p.isEmpty()){
            char ch=p.poll();
            for(int i=0;i<hm.get(ch);i++){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
