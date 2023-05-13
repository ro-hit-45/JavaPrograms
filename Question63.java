
//OPEN  NOTEPAD USING JAVA PROGRAM;
import java.util.*;
import java.io.*;

class Question63 {
    public static void main(String[] args) {
        Runtime m = Runtime.getRuntime();
        try {
            m.exec("notepad");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}