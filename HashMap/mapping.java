import java.util.*;
public class mapping {
    public static void main(String[] args) {
        HashMap <Integer, String> m = new HashMap<>();
        m.put(2,"yash");
        m.put(1,"abhay");
        m.put(6,"shaurya");
        m.put(8,"GG");
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.get(6));
        System.out.println(m.get(7));
        System.out.println(m.containsKey(1));
        System.out.println(m.put(7,"yash"));
        System.out.println(m.put(10,"yash"));
        System.out.println(m.put(10,"Abhay"));
        System.out.println(m.remove(11));
        System.out.println(m);
        System.out.println(m.isEmpty());
        System.out.println(m.getOrDefault(12,"no Name"));
        System.out.println(m.getOrDefault(1,"no Name"));
        System.out.println(m.keySet());
        System.out.println(m.values());



        // Generic hash map

        // HashMap  m = new HashMap<>();
        // m.put(1.23 , "yash");
        // m.put('A' , new int[] {1,2,3,4});
        // m.put(1,"Abhay");
        // m.put("pujara" , "test");
        // System.out.println(m);


    }
}

