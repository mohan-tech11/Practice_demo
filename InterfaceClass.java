
interface A{
    int age=10;             // final and static by default
    String name="telusko";

    void show();
    void display();
}
interface B extends A{ // interface can extend another interface
    
    
}
class C implements B{
    public void show(){
        System.out.println("in show method");
    }
    public void display(){
        System.out.println("in display method");
    }
}
public class InterfaceClass{
    public static void main(String args[]){
        B obj=new C();
        obj.show();
        obj.display();

        System.out.println("Age:"+obj.age);   // static variable can be accessed by class name also
        System.out.println("Name:"+obj.name);
    }
}