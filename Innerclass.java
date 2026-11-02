abstract class A{
    public abstract void drive();
    public abstract void stop();
 
    public void PlayMusic(){
        System.out.println("playing music...");
    }
}




public class Innerclass {
    public static void main(String[] args) {
       A obj = new A(){
           public void drive() {
               System.out.println("driving safely...");
           }
           public void stop() {
               System.out.println("car stopped.");
           }
       };
       obj.drive();
       obj.stop();
       obj.PlayMusic();
    }
}