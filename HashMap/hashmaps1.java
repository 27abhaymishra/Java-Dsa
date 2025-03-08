import java.util.HashMap;
public class hashmaps1 {
    public static void main(String[] args) {
        HashMap <String , Integer> map = new HashMap<>();
          

        // Insertion
        map.put("india" , 120);
        map.put("china" , 150);
        map.put("pakistan" , 30);

        System.out.println(map);

        map.put("china" , 30);
        map.put("napal" , 10);
        // value updated
        System.out.println(map);

//searching
if(map.containsKey("Indonesia")){
System.out.println("Key is present in the map");
}else{
    System.out.println("Key not present in the map");
}

System.out.println(map.get("china"));
System.out.println(map.get("bhopal"));

    }
}
