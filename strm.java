// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;

// public class strm{
//     public static void main(String args[]){
//         List<Integer> list = Arrays.asList(5,2,6,1,3,2,5,6,1,3);

//         Stream<Integer> s1= list.stream();
//           Stream<Integer> s2= s1.filter(n->n%2==0);
//          Stream<Integer> s3= s2.map(n->n*n);

//         list.stream().forEach(n->System.out.println(n));

//         s2.forEach(n->System.out.println(n));
//         s3.forEach(n->System.out.println(n));


//     }
// }

import java.util.Arrays;
import java.util.List;

public class strm {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 6, 1, 3, 2, 5);

        list.stream().forEach(System.out::println);
        System.out.println(); // all values

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println); // even values

        System.out.println();
        list.parallelStream().forEach(System.out::println); // all values, possibly in any order
    }
}