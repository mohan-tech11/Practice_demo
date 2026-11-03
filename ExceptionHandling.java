public class ExceptionHandling{
    public static void main(String args[]){
        int a=10;
        int b=0;
        int arr[]={1,2,3,4,5};
        String str=null;
        try{
            b=20/a;
            System.out.println(arr[4]);
            System.out.println(str.length());

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occured" + e);
        }

        catch(Exception e){
            System.out.println("Exception occured " + e);
        }
        System.out.println(b);
        System.out.println("Bye");
    }
}