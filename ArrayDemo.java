public class ArrayDemo{
    public static void main(String args[]){
    //     int num[]={3, 5, 7, 9, 11 };
    //    // num[2]=8; //modifying the value in the array

    int num[]=new int[5]; //user defined array //array of size 5, index 0-4, all index value is 0 by default
    num[0]=3;
    num[1]=5;
    num[2]=8;
    num[3]=9;
    num[4]=11;

    // for loop to print the array
    // for (int i=0; i<5; i++){
    //     System.out.println(num[i]);
    // }
System.out.println(num[2]);
    }   
}