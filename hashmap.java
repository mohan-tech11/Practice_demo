
import java.util.HashMap;
public class hashmap{
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        System.out.println(map);
        //key-based removal
        map.remove(6);
        System.out.println("Updated list of elements: "+map);
        System.out.println(map.values());
                System.out.println(map.keySet());


    }
}
