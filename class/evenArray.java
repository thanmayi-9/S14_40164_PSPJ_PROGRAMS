//2)write a java program to print all the even numbers of the given array->10 elements
import java.util.Scanner;
public class evenArray{
	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] a = new int[10];

for(int f = 0; f<a.length; f++){
	System.out.printf("Element "+f+" is = ");
		a[f] = sc.nextInt();
}
	int even = 0;
	int odd = 0;

   for(int i = 0; i<a.length; i++){
           
            if(a[i]%2==0){
                 even++;
                 System.out.println("Even number: " + a[i]);

             }
             else{
                 odd++;
                 System.out.println("Odd number: " + a[i]);
             }
         }
         System.out.println("Even numbers = " + even);
         System.out.println("Odd numbers = " + odd);   
         sc.close();
}
}
