/* 
//Write a program to sum three numbers in Java.
import java.util.Scanner;
public class problem02{
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        System.out.println( "ENTER FIRST ");
        int a = sc.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int b = sc.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int c = sc.nextInt();

        int sum = a + b +c;
        System.out.println( "THE SUM OF THREE NUMBER  IS " + sum);
    
    }
    }  */

//Write a program to calculate CGPA using marks of three subjects (out of 100)
 
          import java.util.Scanner;
public class problem02{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER MATH MARKS");

         int math = sc.nextInt();

         System.out.println("ENTER ENGLISH MARKS");
          int eng =  sc.nextInt();

          System.out.println("ENTER physics MARKS");
          int phy =  sc.nextInt();

          int TOTAL = math +eng + phy ;
           
          double p = TOTAL/300.0;
                 double percentage = p*100;
           double CGP = percentage/9.5;

       System.out.println( "YOUR CGP IN FIRST SEMESTER IS " + CGP );
    //    System.out.println(p);

    }
}  
//Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

    // import java.util.Scanner; 
    // public class problem02{
    
    // public static void main(String[] args){

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println( "PLEASE ENTER YOUR NAME ");
    //     String name = sc.nextLine();

    //     System.out.println( " hello " + name +", have a good day ");



    // // }
    // // }

//    Write a Java program to detect whether a number entered by the user is an integer or not.

   /*  import java.util.Scanner; 
    public class problem02{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);




    }}
*/

