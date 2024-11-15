import java.util.ArrayList;
public  class Main {
    public static void main(String[] args) {
    
    ArrayList<Integer>list = new ArrayList<>();
   

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
//     System.out.println(list);
//    int gette =  list.get(3);
//    System.out.println(gette);

//    list.remove(2);
//    System.out.println(list);

//    list.set(2, 10);
//    System.out.println(list);

//    System.out.println(list.contains(1));

System.out.println(list.size());

//print the array list
for(int i = 0 ; i<list.size(); i++){
    System.out.print(list.get(i) + " ");
}
System.out.println();

//Reverse print
for(int i = list.size()-1; i>=0; i--){
System.out.print(list.get(i) + " ");
}
System.out.println();
 }
}