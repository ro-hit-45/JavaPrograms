
/*Write a Java program to check whether the entered number is a spy. */
import java.util.*;

public class Question86 {
    public static void main(String args[]) 
{ 
int number, product=1, sum=0, lastdigit; 

Scanner sc = new Scanner(System.in); 
System.out.print("Enter the number to check: " ); 

number=sc.nextInt(); 

while(number>0)
{ 
    
    lastdigit=number%10;
    sum=sum+lastdigit;
    product=product*lastdigit; 
    number=number/10; 
    } 
    
    if(sum==product) 
   
    System.out.println("The given number is a spy number."); 
    else 
    System.out.println("The given number is not a spy number!!!")
}
}