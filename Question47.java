
/*WRITE A JAVA PROGRAM TO CHECK STUDENT MARKS USING IF ELSE CONDITION , 
IF STUDENT
 MARKS IS ABOVE 33 PRINT PASSED. ELSE PRINT FAILED AND TRY AGAIN*/
import java.util.Scanner;

class Question47 {
    public static void main(String[] args) {
        int Obtainedmarks, passingMarks;
        passingMarks = 33;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter your obtained marks:");
        Obtainedmarks = m.nextInt();
        if (Obtainedmarks >= passingMarks) {
            System.out.println("You passed in the exam.");
        } else {
            System.out.println("you failed in the exam, try again.");
        }
    }
}