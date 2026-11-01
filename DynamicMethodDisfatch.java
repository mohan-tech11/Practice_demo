
class A{
    public void show (){
        System.out.println("Class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Class B");
    }

}
class C extends A{
    public void show(){
        System.out.println("Class C");
    }
}

// Dynamic Method Disfatch
public class DynamicMethodDisfatch{
    public static void main(String args[]){
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();

    }
} 