class A {
    public int add(int n1, int n2){
                System.out.println("in add method of class A");

        return n1+n2;
    }

}
class B extends A {
    // overridemethod
    public int add(int n1, int n2){
                System.out.println("in add method of class B");

        return n1+n2;
    }
}




// Method overriding
public class OverRide{
    public static void main(String args[]){
        A b=new A();
        int r=b.add(10,20);
        System.out.println(r);


    }
}