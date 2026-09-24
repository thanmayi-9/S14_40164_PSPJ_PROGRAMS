import java.util.*;
public class student {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the name = ");
    String name = sc.next();
    System.out.println("Name = "+name);

    System.out.print("Enter the Roll no = ");
    int rollno = sc.nextInt();
    System.out.println("Roll number = "+rollno);

    System.out.print("Enter the marks = ");
    int studentmarks =sc.nextInt();

    int totalmarks = 500;

    float avg = studentmarks*100.0f/totalmarks;
    System.out.println("Enter the Avg percentage = ");

if(avg > 98){
System.out.println("O");
}
else if(avg>=80){
System.out.println("A");
}
else if(avg>=69){
System.out.println("B");
}
else if(avg>=55){
System.out.println("C");
}
else if(avg>=42){
System.out.println("D");
}
else{
System.out.println("Fail");
}
sc.close();
}
}