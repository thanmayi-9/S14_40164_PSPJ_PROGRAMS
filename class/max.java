//import java.lang.*;
import java.util.Scanner;
public class max{
public static void main(String[ ] args){

Scanner sc = new Scanner(System.in);

int a ;
System.out.print("Enter a value = ");
a = sc.nextInt();


int b ;
System.out.print("Enter b value = ");
b = sc.nextInt();

if(a>b){
System.out.println(a);
}
else{
System.out.println(b);
}

sc.close();

}
}