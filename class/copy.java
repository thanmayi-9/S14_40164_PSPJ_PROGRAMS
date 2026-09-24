//3)write a java program to copy one array elements into another array
import java.util.Scanner;
public class copy{
	public static void main(String[] args){
	
   Scanner sc = new Scanner(System.in);
   int[] a = new int[5];

for(int f = 0; f<a.length; f++){
	System.out.printf("Element "+f+" is = ");
		a[f] = sc.nextInt();
}

int copy = 0;

for(int i = 0; i<a.length; i++){
 	
	copy = a[i] ;
}

System.out.println(copy);
sc.close();
}
}
