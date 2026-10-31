class A 
{
    public A(){
        super();
        System.out.println(" in A");
    }
    public A(int n)//parameterized
    {
                super();
                  System.out.println(" in A int");
    }

}
class B extends A{
    public B(){
                super();
        System.out.println(" in B");
    }
    public B(int n)//parameterized
    {
                // super();
                this();//this is used to call current class constructor 

        System.out.println(" in B int");
    }
}



public class Super{
    public static void main(String args[]){
        B b=new B(3);

    }
}