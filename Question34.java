/*  Write a program which  age of a person and if the age between 
18 to 36 then print eligible for UPSC exams otherwise print not eligibe.*/

import java.util.*;

public class Question34 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE : ");
        int age = m.nextInt();
        if (age >= 18 && age <= 36) {
            System.out.print(" YOU ARE ELIGIBLE FOR UPSC EXAM.");
        } else {
            System.out.println("YOU ARE NOT ELIGIBLE FOR UPSC EXAM!!!");
        }
    }

}