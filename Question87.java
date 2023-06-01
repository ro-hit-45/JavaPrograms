
/*Write a Java program to print the elements of an array in Reverse order. */
import java.util.*;

public class Question87 {
    public static void main(String[] args) {

        int[] arr = new int[] { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        System.out.println("Original array:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}