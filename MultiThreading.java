//class A implements Runnable{
// OR
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi")   ;
         try{
                Thread.sleep(2); // sleep method is used to pause the execution of the current thread for a specified amount of time (in milliseconds). In this case, it pauses for 2 milliseconds.
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
        
    }

}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello")   ;
            try{
                Thread.sleep(2); // sleep method is used to pause the execution of the current thread for a specified amount of time (in milliseconds). In this case, it pauses for 2 milliseconds.
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}

}

public class MultiThreading{
     public static void main(String args[]){
        
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
       
         
     }
 }