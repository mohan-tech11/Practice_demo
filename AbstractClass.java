// abstract keyword Program

// abstract class car{
//     public abstract void drive();

//     public void PlayMusic(){
//         System.out.println("playing music...");
//     }
// }

// class bmw extends car{
//     public void drive(){
//         System.out.println("driving bmw");
//     }
// }

// annonymous class
class car{
    public void drive(){
        System.out.println("driving bmw");
    }
}
public class AbstractClass {
    public static void main(String args[]) {
        car b=new car()
        { 
            //Annonymous class
            public void drive(){ // annonymous class
                System.out.println("driving new bmw");
            }
        };
        // b.PlayMusic();
        b.drive();
    
    }
}