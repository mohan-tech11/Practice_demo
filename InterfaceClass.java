
interface A{
    void show();
    void display();
}
class B implements A{
    public void show(){
        System.out.println("in show method");
    }
    public void display(){
        System.out.println("in display method");
    }
}
public class InterfaceClass{
    public static void main(String args[]){
        A obj=new B();
        obj.show();
        obj.display();
    }
}