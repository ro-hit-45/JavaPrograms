import java.util.*;

public class Question62 {

    public static void main(String[] args) {
        int a;
        Random q = new Random();
        for (a = 1; a <= 25; a++) {
            System.out.println(q.nextInt(200));
        }
    }
}
