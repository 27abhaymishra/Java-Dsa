import java.util.*;
public class practice {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int nums [] = {1,2,-2,3,-3,-1};
        for(int i = 0 ; i<nums.length; i++){
            map.put(nums[i],i);
        }
        // System.out.println(map);
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.getOrDefault(8,0));
        // System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.get(7));
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }
        for(int k : map.keySet()){
          System.out.println(k + "->" + map.get(k));
        }
    }
}
