/*public class traversal{
    public static void main(String[] args){
int a[] = { 10 , 20 , 30 , 40 , 50};
for(int i = 0 ;i<a.length; i++){
System.out.println(a[i]);
}
}
}*/

/*import java.util.Scanner;
public class traversal{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
for(int f = 0 ; f<=4; f++){
System.out.printf("Element" + f + " is : " );
a[f] = sc.nextInt();
}
for(int i = 0 ;i<a.length; i++){
System.out.println(a[i]);
}
}
}*/

import java.util.Scanner;
public class traversal{
	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
for(int f = 0; f<a.length; f++){
System.out.printf("Element "+ f + " is : ");
a[f] = sc.nextInt();
}
int count = 0;
for(int i = 0; i<a.length; i++){
if(a[i] > 30){
count++; 
System.out.println(a[i]);
sc.close();
}
}
    

/*System.out.println(count);
 it will the number which are less than as zeros (0) but when it reaches the number greater than 30 it prints 1 then after another number it prints 2 
System.out.println("Count = "+count);
*/
System.out.println("Count = "+count);
}


}


/*1.Array reading and printing all the elements
2.sum and avg of all elements
3.largest of array
4.smallest element of the arrays
5.counting number of elements
6.searching if that element exists*/

/*import java.util.Scanner;
public class traversal{
 	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
for(int f = 0; f<a.length; f++){
System.out.printf("Element "+f+" is : ");
a[f] = sc.nextInt();
}
int sum = 0;

for(int i = 0; i<a.length; i++){
   sum = sum + a[i];
	
}
double avg = (double)sum / a.length;

System.out.println("Sum = "+sum);
System.out.println("Avg = "+avg);
sc.close();
}
}*/

/*import java.util.Scanner;
public class traversal{
 	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
for(int f = 0; f<a.length; f++){
System.out.printf("Element "+f+" is : ");
a[f] = sc.nextInt();
}
    int largest = a[0];
for(int i = 0; i<a.length; i++){
   if(a[i]>largest){
	largest = a[i];
}
}
System.out.println("Largest number = "+largest);
sc.close();
}
}*/

// import java.util.Scanner;
// public class traversal{
//       public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a[] = new int[5];
// for(int f = 0; f<a.length; f++){
//   	System.out.printf("Element "+f+" is: ");
// a[f] = sc.nextInt();
// }
// System.out.printf("Searching element : ");
// int search = sc.nextInt();

// int found = 0;

// for(int i = 0; i<a.length; i++){
// 	if(a[i]==search){
		
// System.out.println("Element found = "+a[i]);
// found = 1;
// }
// }
// if(found == 1){
// System.out.println("Element found");
// }
// else{
// System.out.println("Element not found");
// }

// }
// }

//last and first element
// import java.util.Scanner;
// public class traversal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a[] = new int[5];
//         for (int f = 0; f < a.length; f++) {
//             System.out.printf("Element " + f + " is: ");
//             a[f] = sc.nextInt();
//         }
//         System.out.println(a[0]);
//         System.out.println(a[a.length - 1]);
//         sc.close();
//     }
// }

// reverse of an array
// import java.util.Scanner;
// public class traversal{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a[] = new int[5];
//         for(int f = 0; f<a.length; f++){
//         System.out.printf("Element "+f+" is: ");
//         a[f] = sc.nextInt();
//         }
//         for (int i = a.length-1; i>=0; i--){
//     System.out.println(a[i]);
//         }
//         sc.close();
//     }
// }

// //count even and odd numbers
// import java.util.Scanner;
// public class traversal{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a[] = new int[5];
//         for(int f =0; f<a.length ; f++){
//             System.out.printf("Element "+f+" is: ");
//             a[f] = sc.nextInt();
//         }
//         int even = 0;
//         int odd = 0;
//         for(int i = 0; i<a.length; i++){
           
//             if(a[i]%2==0){
//                 even++;
//                 System.out.println("Even number: " + a[i]);

//             }
//             else{
//                 odd++;
//                 System.out.println("Odd number: " + a[i]);
//             }
//         }
//         System.out.println("Even numbers = " + even);
//         System.out.println("Odd numbers = " + odd);        
            
//             sc.close();
//     }
// }

// import java.util.Scanner;
// public class traversal{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a[] = new int[5];
//         for(int f =0; f<a.length; f++){
//             System.out.printf("Element "+f+" is: ");
//             a[f] = sc.nextInt();
//         }
        
//         for(int i = 0; i<a.length; i++){
//             if(a[i]>0){
//                 System.out.println("Positive");
//             }
//             else if(a[i]==0){
//                 System.out.println("Zero");
//             }
//             else{
//                 System.out.println("Negative");
//             }
            
            
//         }
//         sc.close();
//     }
// }









