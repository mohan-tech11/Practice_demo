
class Mobile{
    int price;
    String brand;
    static String name;
     
  static {
      name="Smartphone";
      System.out.println("Static");
      
  }
  public Mobile()   //constructor
  {
      System.out.println("Constructor");
  }
    
}


public class StaticDemo{
    public static void main(String args[]){

        Mobile m1=new Mobile();
         System.out.println(m1.price);
        System.out.println(m1.brand);

        m1.price=10000;
        m1.brand="Samsung";

        // System.out.println(m1.price);
        // System.out.println(m1.brand);

        // Mobile m2=new Mobile();

       
    }
}