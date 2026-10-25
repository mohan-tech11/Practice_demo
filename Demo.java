//Encapsulation

class human{
    private int age;
    private String name;
    private String adress;


    public int getAge(){
        return age;
    }
    public int setAge(int age){
        this.age=age;
        return age;
    }
        public String getName(){
        return name;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }
    public String getAdress(){
        return adress;
    }
    public String setAdress(String adress){
        this.adress=adress;
        return adress;
    }
}

public class Demo{
    public static void main(String args[]){
        human h=new human();

        h.setAge(20);
        h.setName("Mohan");
        h.setAdress("sirsi");

         System.out.println(h.getAge());
         System.out.println(h.getName());
         System.out.println(h.getAdress()); 
    } 
}