
// Latest Source Code to read user input using Scanner

import java.util.Scanner;

public class UserInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("You entered: " + a);
    }
}



// Old Source Code to read user input using BufferedReader

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class UserInput{
//     public static void main(String args[]){
//       System.out.println("Enter a number:");
//       InputStreamReader in= new InputStreamReader(System.in);
//       BufferedReader br = new BufferedReader(in);
//         try{
//             int a = Integer.parseInt(br.readLine());
//             System.out.println("You entered: " + a);
//         }
//         catch(Exception e){
//             System.out.println("Exception occured: " + e);
//         }
//     }
// }