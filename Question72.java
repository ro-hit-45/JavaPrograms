
/* WRITE A JAVA PROGRAM TO FIND OUT WETHER A STUDENT IS PAAS OR FAIL
     IF A REQUIRED TOTAL 33% AND AT LEAST 33% IN EACH SUBJECT TO
  PASS ASSUME 6 SUBJECTS AND TOTAL MARKS AS A INPUT FROM THE USER.  */
import java.util.*;

public class Question72 {
    public static void main(String[] args) {
        byte s1, s2, s3, s4, s5, s6;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter your marks in Oerating system");
        s1 = m.nextByte();
        System.out.println("Enter your marks in Operation research");
        s2 = m.nextByte();
        System.out.println("Enter your marks in Data communication network");
        s3 = m.nextByte();
        System.out.println("Enter your marks in Softwere engineering");
        s4 = m.nextByte();
        System.out.println("Enter your marks in Java programming");
        s5 = m.nextByte();
        System.out.println("Enter your marks in Numerical method");
        s6 = m.nextByte();
        float avg = (s1 + s2 + s3) / 6f;
        if (avg >= 33 && s1 >= 33 && s2 >= 33 && s3 >= 33 && s4 >= 33 && s5 >= 33 && s6 >= 33) {
            System.out.println("Congratulations,you have been passed.");
        } else {
            System.out.println("Sorry,you have been failed!!!");
        }

    }
}