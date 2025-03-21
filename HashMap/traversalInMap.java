import java.util.*;

public class traversalInMap {
    public static void main(String[] args) {
        HashMap <Integer,String> m = new HashMap<>();
        m.put(1,"A");
        m.put(6,"B");
        m.put(8 , "C");
        m.put(4,"D");

        // for(Map.Entry<Integer,String> e: m.entrySet()){
        //     System.out.println(e.getKey() + "->" + e.getValue());
        // }

        for(int k : m.keySet()){
            System.out.println(k + "->" + m.get(k));
         
        }

        for(String v : m.values()){
            System.out.println(v);
        }
    }
}
