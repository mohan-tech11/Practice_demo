
// interface A{
//     int age=10;             // final and static by default
//     String name="telusko";

//     void show();
//     void display();
// }
// interface B extends A{ // interface can extend another interface
    
    
// }
// class C implements B{
//     public void show(){
//         System.out.println("in show method");
//     }
//     public void display(){
//         System.out.println("in display method");
//     }
// }
// public class InterfaceClass{
//     public static void main(String args[]){
//         B obj=new C();
//         obj.show();
//         obj.display();

//         System.out.println("Age:"+obj.age);   // static variable can be accessed by class name also
//         System.out.println("Name:"+obj.name);
//     }
// }

@FunctionalInterface 
interface A{

    // void show(int i);
    int add(int i,int j);
}


public class InterfaceClass{
    public static void main(String args[]){
         

        //for show method

        // A obj=(i)->{ // lambda expression in anonymous class, it is used to implement functional interface
        //     System.out.println("in show method:"+i);
        // };
        // obj.show(11);

        //add method

        // A obj=(int i,int j)->{ // even you don't need to specify the data type of parameters, it will be inferred from the functional interface
        //         return i+j;  //even you don't need to write return statement, it will be inferred from the functional interface
        //     };    
//          int result=obj.add(18,23);
//             System.out.println(result);
//     }
// }     
            
            A obj=(i,j)->i+j;  
        int result=obj.add(18,23);
            System.out.println(result);
    }
}