

public class StringDemo{
    public static void main(String arg[]){

        StringBuffer sb =new StringBuffer("Mohan");
        // System.out.println(sb.capacity());
        sb.append(" Naik ");
        sb.insert(10, " java");
        sb.deleteCharAt(10);
 
                // System.out.println(sb.length());

        System.out.println(sb);
    }
}