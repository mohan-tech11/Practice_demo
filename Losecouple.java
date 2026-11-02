
interface Computer{       // class Computer{public abstract void code();}  // abstract class can have abstract method but interface can have only abstract method
        void code();      // interface is used to achieve loose coupling
   
    
}


class Laptop implements Computer{
    public void code(){
        System.out.println("working...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("working...:Faster");
    }
}


class Developer{
    public void develop(Computer com){
        com.code();
    }
}


public class Losecouple{
    public static void main(String args[]){
        
        Developer dev=new Developer();
        Computer lap=new Laptop();
        Computer desk=new Desktop();

        dev.develop(desk);
    }
}