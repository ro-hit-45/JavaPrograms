
//Write a java program count the entered string.
import java.util.*;

public class Question69 {
    public static void main(String[] args) {
        String string = ("once upon a time everything was beautiful!!!");
        int a = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ')
                a++;
        }

        System.out.println("TOTAL NUMBER OF CHARACTERS IN STRING IS :- " + a);
    }
}