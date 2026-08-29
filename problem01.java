import java.util.Scanner;
public class problem01 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER Math marks");
        int math = sc.nextInt();
        
                 System.out.println("ENTER English marks");
         int english = sc.nextInt();

         System.out.println("ENTER PHYSICS MARKS");
         int physicsMarks = sc.nextInt(); 
           
         System.out.println("ENTER CHEMISTRY MARKS");
         int chemistryMarks = sc.nextInt();
         System.out.println("ENTER PHYSICAL EDUCATION marks");
         int physicaleducation = sc.nextInt();

         int TOTAL = math + english + physicsMarks +chemistryMarks + physicaleducation ;
 double percentage = (TOTAL * 100.0) / 500;

         System.out.println("TOTAL MARKS ="+TOTAL  );
        System.out.println("YOU GOT "+percentage + "%");

    }
}
