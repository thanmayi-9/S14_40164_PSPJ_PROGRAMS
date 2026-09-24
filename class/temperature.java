//import java.util.Scanner;
//public class temperature{
   // public static void main(String[] args){
//Scanner sc = new Scanner(System.in);
//System.out.printf("Enter a temperature = ");
//int c = sc.nextInt();
//System.out.println("Celsius temperature = "+c+"\u00B0C");
//float f = 32+c*9.0f/5;
//System.out.print("Fahrenheit temperature = "+f+ "\u00B0F");
//}
//}

import java.util.Scanner;
public class temperature{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.printf("Enter a temperature = ");
int f = sc.nextInt();
System.out.println("Fahrenheit temperature = "+f+"\u00B0F");
float c = (f-32)*5.0f/9;
System.out.println("Celsius temperature = "+c+"\u00B0C");

sc.close();

}
}