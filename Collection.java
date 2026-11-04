import java.util.*;
public class Collection{
    public static void main(String args[]){
        
        // List<Integer>  num= new ArrayList<Integer>();
        Set<Integer> num= new HashSet<Integer>();
        num.add(7);
        num.add(6);
        num.add(3);
        num.add(9);
        num.add(5);

// System.out.println(num.get(1)); //for List, we can get index but for Set, we cannot get index because Set is unordered collection.
System.out.println();
        for (int n : num    ){
                    System.out.println(n);

        }
    }
}