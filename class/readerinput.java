import java.util.Scanner;

public class readerinput{
      public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.printf("Enter name = ");
String name = sc.nextLine();

System.out.printf("Enter roll no : ");
String rollno = sc.next();

System.out.printf("Enter the DOB : ");
String age = sc.next();

System.out.printf("Enter the maths marks : ");
int maths = sc.nextInt();

System.out.printf("Enter the physics marks : ");
int physics = sc.nextInt();

System.out.printf("Enter the chemistry marks : ");
int chemistry = sc.nextInt();

float percentage = (maths+physics+chemistry) * 100.0f/300;
System.out.println("Name = "+name);
System.out.println("Roll no = "+rollno);
System.out.println("DOB =  "+age);
System.out.println("Maths marks = "+maths);
System.out.println("Physics marks = "+physics);
System.out.println("Chemistry marks = "+chemistry);
System.out.println("Percentage = "+percentage);

sc.close();

}
}
