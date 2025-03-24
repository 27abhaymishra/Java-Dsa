import java.util.HashMap;
public class example {
   public static void main(String[] args) {
    HashMap <Integer , String> m = new HashMap<>();
      m.put(2 , "abhay");
      m.put(5 , "harsh");
      m.put(1,"rahul");
      m.put(7,"aran");
      m.put(9,"esa");

    //   System.out.println(m.get(7));
    //   System.out.println(m.containsKey(2));
    //   System.out.println(m.size());
    //   System.out.println(m.containsValue("harsha")); 
    //   System.out.println(m.remove(2));
    //   System.out.println(m.isEmpty());
    //   System.out.println(m.getOrDefault(2,"not Found"));

    //   System.out.println(m.keySet());
    //   System.out.println(m.values());

    //   for(Map.Entry<Integer,String> a : m.entrySet()){
    //     System.out.println(a.getKey() + "->" + a.getValue());
    //   }
      
    for(int i : m.keySet()){
              System.out.println(i +"->" + m.get(i));
    }
   } 
}
