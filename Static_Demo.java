class Mobile{
    int price;
    String brand;
    static String name;

    public void call(){
        System.out.println("brand:"+brand+" price:"+price+" name:"+name);

    }
    public static void text(){
        System.out.println("Texting");
    }
    
    }

   


public class Static_Demo {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.price=10000;
        m1.brand="Samsung";
                Mobile.name="Smartphone";
                // System.out.println(m1.price);
                // System.out.println(m1.brand);
                // System.out.println(Mobile.name);

                // System.out.println();

        m1.call();
        
       
        Mobile m2=new Mobile();
        m2.price=19000;
        m2.brand="Iphone";
        Mobile.name="Smartphone";

        // System.out.println(m2.price);
        //         System.out.println(m2.brand);
        //         System.out.println(Mobile.name);

        m2.call();
                        System.out.println();


        Mobile.text();
    }
}