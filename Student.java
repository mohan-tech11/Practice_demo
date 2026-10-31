// //object oriented programming
// class Calculator {
// public int add(int n1, int n2) {
// int r = n1 + n2;
// return r;
// }
// }

// public class Student {
// public static void main(String[] args) {

//     // Creating an object of the Calculator class
//     int num1 = 10;
//     int num2 = 20;

//     Calculator cal = new Calculator();

//     int result = cal.add(num1, num2);

// System.out.println("Addition: " + result);
// }

// }

//2
class Computer{
    public void Play(){
        System.out.println("playing music...");

    }
    public String GetMeAPen(int cost){
        if(cost >= 10){
            return "I will give you a pen of cost: " + cost;
        }
        else{
            return "NO pen available of cost: " + cost;
        }
    }
}

 public class Student {
 public static void main(String[] args) {

    Computer com = new Computer();
    com.Play();

    String pen = com.GetMeAPen(10);
    System.out.println(pen);

 }
}

// class Calculator {
// public int add(int n1, int n2) {
// return n1 + n2;}
// }

// public class Student {
// public static void main(String[] args) {

//     // Creating an object of the Calculator class
// Calculator cal = new Calculator();

//     int r1 = cal.add(10, 20);
//     System.out.println("Addition: " + r1);
// }

// }



//Method Overloading
// class Calculator {
// public int add(int n1, int n2) {
// return n1 + n2;
// }
// // public int add(int n1, int n2, int n3) {
// // return n1 + n2 + n3;            

// // }
// // public double add (double n1, int n2){
// // return n1 + n2;
// // }
// }

// public class Student {
// public static void main(String[] args) {

//     // Creating an object of the Calculator class
// Calculator cal = new Calculator();

//     int r1 = cal.add(10, 20);
//     // int r1 = cal.add(10, 20, 30);
//     // double r1 = cal.add(10, 20);
//     System.out.println("Addition: " + r1);
// }

// }