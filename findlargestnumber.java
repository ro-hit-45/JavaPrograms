import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.xml.transform.sax.SAXSource;

public class findlargestnumber {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter three integer");
        Scanner n = new Scanner(System.in);
        x = n.nextInt();
        y = n.nextInt();
        z = n.nextInt();
        if (x > y && x > z)
            System.out.println("First number is largest");
        else if (y > x && y > z)
            System.out.println("Second  number is largest");
        else if (z > x && z > y)
            System.out.println("Third number is largest");
        else
            System.out.println("Entered number is not matched");

    }

}
