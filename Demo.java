//Encapsulation

class human{
    private int age;
    private String name;
    private String adress;
    private int salary;


    public human()//Default constructor
    {
        age=21;
        name="Mohan";
        adress="sirsi";
        salary=10000;
    } 
    public human(int a, String n, String ad, int sal)//parameterized constructor
{
    age=a;
    name=n;
    adress=ad;
    salary=sal;
}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

    
public class Demo{
    public static void main(String args[]){
        human h=new human();
                human h1=new human(22, "Naman" , "Pune", 20000);


        
        // h.setAge(20);
        // h.setName("Mohan");
        // h.setAdress("sirsi");
        //  h.setSalary(10000);
          System.out.println("Age:"+h.getAge()+ " Name:"+h.getName()+" Adress:"+h.getAdress()+" Salary:"+h.getSalary()); // calling getter using constructor
         

                  System.out.println("Age:"+h1.getAge()+ " Name:"+h1.getName()+" Adress:"+h1.getAdress()+" Salary:"+h1.getSalary()); // calling getter using constructor



       
    } 
}