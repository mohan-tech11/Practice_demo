// public class JaggedArray{
//     public static void main(String args[]){
//         int num[][]=new int [3][];
//         num[0]=new int[4];
//          num[1]=new int[2];
//         num[2]=new int[3];


       
//  for(int i=0;i<num.length;i++){
//             for(int j=0;j<num[i].length;j++){
//             num [i][j]=(int) (Math.random() * 10);

//             }
//         }   

// for(int n[]:num){
//             for(int m:n){
//                 System.out.print(m+" ");
//             }
//             System.out.println();
//         }

//     }
    

// }


//ARRAY WITH STRINGS

class Student{
    int regno;
    String name;
    int marks;

}
public class JaggedArray{
    public static void main(String args[]){

        Student s1=new Student();
        s1.regno=10;
        s1.name="Mohan";
        s1.marks=79;

        Student s2=new Student();
        s2.regno=12;
        s2.name="navin";
        s2.marks=85;

        Student s3=new Student();
        s3.regno=18;
        s3.name="kiran";
        s3.marks=97;

        Student student[]=new Student[3];
        student[0]=s1;
        student[1]=s2;

        student[2]=s3;


//normal for loop
// for (int i=0;i<student.length;i++){
//     System.out.println(student[i].name + ":" + student[i].regno);

//enhanced for loop
  for(Student s:student){
    System.out.println(s.name+ ":" +s.regno+ ":" + s.marks);
}
}

    }
