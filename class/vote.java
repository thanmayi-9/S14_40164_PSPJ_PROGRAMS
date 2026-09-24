//import java.lang.*;
import java.util.Scanner;
public class vote{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int age;
System.out.print("Enter the age = ");
age = sc.nextInt();

// age>=18? "Eligible ": "Not Eligible";
System.out.println(age >= 18 ? "Eligible" : "Not Eligible");
sc.close();

}
}