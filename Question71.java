
/* WRITE A JAVA PROGRAM TO FIND OUT WETHER A STUDENT IS PAAS OR FAIL
     IF A REQUIRED TOTAL 40% AND AT LEAST 33% IN EACH SUBJECT TO
  PASSASSUME 3 SUBJECTS AND TOTAL MARKS AS A INPUT FROM THE USER.  */
import java.util.*;

public class Question71 {
    public static void main(String[] args) {
        byte s1, s2, s3;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter your marks in operating system");
        s1 = m.nextByte();
        System.out.println("Enter your marks in java programming");
        s2 = m.nextByte();
        System.out.println("Enter your marks in softwere engineering");
        s3 = m.nextByte();
        float avg = (s1 + s2 + s3) / 3f;
        if (avg >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33) {
            System.out.println("congratulations,you have been passed.");
        } else {
            System.out.println("sorry,you have been failed!!!");
        }

    }
}