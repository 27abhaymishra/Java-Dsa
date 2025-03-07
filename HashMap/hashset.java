
import java.util.HashSet;
import java.util.Iterator;
public class hashset {
   public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
//Insert
set.add(1);
set.add(2);
set.add(3);
set.add(1);
set.add(6);


//searching
System.out.println(set.contains(2));

System.out.print(set + " ");
set.remove(3);
System.out.print(set + " ");
System.out.println(set.size());
Iterator it = set.iterator();

//hasnext();
// next()
while(it.hasNext()){
System.out.print(it.next() + " ");
}
   } 
}
