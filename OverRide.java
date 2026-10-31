class A {
    public int add(int n1, int n2){
        return n1+n2;
    }

}
class B extends A {
    // overridemethod
    public int add(int n1, int n2){
        return n1+n2+2;
    }
}




// Method overriding
public class OverRide{
    public static void main(String args[]){
        B b=new B();
        int r=b.add(10,20);
        System.out.println(r);


    }
}