import java.util.Scanner;
public class palindrome{
   public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.printf("Enter a number = ");
int n = sc.nextInt();
int palindrome = 0;
int original = n;

for(;n>0;n=n/10){
int digit = n%10;
palindrome = palindrome*10+ digit;
}
if(original == palindrome){
System.out.println("It is a palindrome");
System.out.println("Palindrome = "+palindrome);
}
else{
System.out.println("It is not a palindrome");
}
sc.close();
}
}