

public class StringDemo{
    public static void main(String arg[]){

        StringBuffer sb =new StringBuffer("Mohan");
        sb.append(" Naik");
        sb.insert(10, " java");
        sb.deleteCharAt(4);
        System.out.println(sb);
    }
}