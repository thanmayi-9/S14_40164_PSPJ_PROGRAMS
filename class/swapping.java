import java.util.Scanner;

public class swapping{
     public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.printf("Enter A value = ");
int a = sc.nextInt();
System.out.printf("Enter B value = ");
int b = sc.nextInt();

// This is for four variables
//int a = B ;
//int b = A ;

//This is by addition
//a = a + b ;
//b = a - b ;
//a = a - b ;

//This is for three variables
int c = a;
a = b;
b = c;

System.out.println("A = "+a)
;
System.out.println("B = "+b);

sc.close();

}
}