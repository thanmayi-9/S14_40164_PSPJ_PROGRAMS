//1)write a java program to read 5 integers at run time and find the sum and avg of the given elements
import java.util.Scanner;
public class SumAvg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];

		for(int f = 0; f<a.length; f++){
			System.out.printf("Element "+f+" is = ");
		a[f] = sc.nextInt();
		}

		int sum = 0;
		for(int i = 0; i<a.length; i++){
			sum = sum +a[i];
		}

		double avg = (double)sum/a.length;
		System.out.println("SUM = "+sum);
		System.out.println("AVERAGE = "+avg);
	sc.close();
}
}

// import java.util.Scanner;
// public class SumAvg{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[5];
        
//         for(int n = 0; n<a.length; n++){
//             System.out.println("Enter element = ");
//         a[n]= sc.nextInt();
       
//         }
//         int sum = 0;
         
//         for(int i = 0; i<a.length; i++){
//             sum = sum + a[i];
            
//         }
//         double average = (double)sum/a.length;
//         System.out.println(sum);
//         System.out.println(average);
//          sc.close();
//     }

   
// }
		



