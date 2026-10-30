
class Mobile{
    int price;
    String brand;
    static String name;
     
  static {
      name="Smartphone";
      System.out.println("Static");
      
  }
  public Mobile(){
      price=10000;
      brand="Samsung";
      System.out.println("Constructor");
  }
    
}


public class StaticDemo{
    public static void main(String args[]){

        Mobile m1=new Mobile();
        m1.price=10000;
        m1.brand="Samsung";

                Mobile m2=new Mobile();

       
    }
}