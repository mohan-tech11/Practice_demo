public class InheritanceDemo{
    public static void main(){
        MoreAdvCalc ac=new MoreAdvCalc();
        int r1=ac.add(9, 2);
        int r2=ac.sub(7, 2);
         int r3=ac.mult(9, 5);
        int r4=ac.div(8, 2);
        double r5=ac.power(2, 3);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 );
    }

}