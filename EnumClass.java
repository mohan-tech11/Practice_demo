// enum Status{
//     Pending, Running, Approved, Rejected

// }

enum Laptop{
    Dell(40000), Hp(30000), Lenovo, Mac(100000);

    private int price;

    private Laptop(){ // default constructor
        this.price=50000;
    }

    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class EnumClass{
    public static void main(String args[]){

        for(Laptop l: Laptop.values()){
            System.out.println(l+" price:"+l.getPrice());
        }
    //    Status s=Status.Pending;

    //    switch(s){
    //           case Pending:
    //             System.out.println(Status.Pending+" wait ");
    //             break;
    //           case Running:
    //             System.out.println(Status.Running+" Please wait...");
    //             break;
    //           case Approved:
    //             System.out.println(Status.Approved+" congratulations!");
    //             break;
    //           default:
    //             System.out.println(Status.Rejected+" try again...");
    //             break;
    //    }



    //    if(s==Status.Pending){
    //        System.out.println(Status.Pending+" please wait...");
    //    }
    //    else if(s==Status.Running){
    //        System.out.println(Status.Running+" is running...");
    //    }
    //    else if(s==Status.Approved){
    //        System.out.println(Status.Approved+" is approved...");
    //    }
    //    else if(s==Status.Rejected){
    //        System.out.println(Status.Rejected+" is rejected...");
    //    }
    }
}

