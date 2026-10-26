//Encapsulation

class human{
    private int age;
    private String name;
    private String adress;
    private int salary;


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
    public int getSalary(){
        return salary;
    }
    public int setSalary(int salary){
        this.salary=salary;
        return salary;
    }
}

public class Demo{
    public static void main(String args[]){
        human h=new human();

        h.setAge(20);
        h.setName("Mohan");
        h.setAdress("sirsi");
        h.setSalary(10000);

         System.out.println(h.getAge());
         System.out.println(h.getName());
         System.out.println(h.getAdress()); 
         System.out.println(h.getSalary());
    } 
}