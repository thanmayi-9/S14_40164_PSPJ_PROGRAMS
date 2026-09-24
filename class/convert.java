import java.util.Scanner;
public class convert{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.printf("Enter a letter = ");
char a = sc.next().charAt(0);
//int a = sc.nextInt();
System.out.println("Convert to int = "+(int)a);

sc.close();

}
}