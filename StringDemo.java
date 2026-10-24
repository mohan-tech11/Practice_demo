

public class StringDemo{
    public static void main(String arg[]){

        StringBuffer sb =new StringBuffer("Mohan");
        sb.append(" Naik");
        sb.insert(10, " java");
        System.out.println(sb);
    }
}