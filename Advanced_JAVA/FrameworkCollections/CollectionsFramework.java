package FrameworkCollections;
import java.util.*;
public class CollectionsFramework {
    public static void main(String[] args) {
        //ARRAYLIST
    ArrayList<Integer> al=new ArrayList<>();
    al.add(5);al.add(6);al.add(7);al.add(8);al.add(8); //resize array
//        for(int i:al){
//            System.out.println(i);
//        }
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        al.add(0,1); // 5,6,7,8 => 1,5,6,7,8 , insert at position
        //al.clear(); clear all array
        //al.addAll(al2); another arraylist added
        System.out.println(al.contains(7));   //true
        System.out.println(al.indexOf(8));
        System.out.println(al.lastIndexOf(8));
        System.out.println(al.isEmpty());   //false
       // al.remove(3); here 3 is index
        al.set(1,14);//1 is index, changing index 1 element
        System.out.println(al);
        ArrayList<Integer> al2=(ArrayList<Integer>)al.clone();    //shallow copy
        System.out.println(al2);

        //LINKED LIST    (ARRAYDEQUE also have same functions as LL)
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(2);ll.add(3);ll.add(4);
        ll.add(1,4); //inserting
        ll.get(2);//2 is index
        //ll.remove(2); 2 is index
        //ll.clear();
        System.out.println(ll.size());
        ll.set(0,11);  //0 is index, changing index 0: element
        ll.addLast(6);ll.addFirst(12);               //offer in ARRAYDEQUE
        //ll.removeFirst(); ll.removeLast();                 poll in ARRAYDEQUE
        System.out.println(ll.getFirst());                 //peek in ARRAYDEQUE
        System.out.println(ll.getLast());
        System.out.println(ll);

        //HASHSET
        HashSet<Integer> hs=new HashSet<>();
        hs.add(2);hs.add(3);hs.add(4);
        hs.add(2); //duplicate ignored , Set has no ordering
        System.out.println(hs);
        System.out.println(hs.contains(3)); //true
        //hs.clear();
        System.out.println(hs.isEmpty());

        //HASHMAP
        HashMap<Integer,Integer>  m=new HashMap<>();
        m.put(1,1); //key-value
        m.put(2,3); m.put(3,11);
        System.out.println(m.get(2));//2 is key
        System.out.println(m.containsKey(2));//true
        System.out.println(m.containsValue(12)); //false
        //m.remove(2);  2 is key
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.keySet()); //returns list of keys
        System.out.println(m.values()); //returns list of values
    }
}
