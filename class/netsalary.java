import java.util.Scanner;
public class netsalary{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.printf("Enter the basic salary of an employee = ");
float basic_salary = sc.nextFloat();
float hra = (20*basic_salary)/100;
float da = (10*basic_salary)/100;

float net = basic_salary+hra+da;

System.out.println("Basic salary = "+basic_salary);
System.out.println("HRA = "+hra);
System.out.println("DA = "+da);
System.out.println("Net salary = "+net);

sc.close();

}
}

// public class employee{
// 	public static void main(String[] args){
// 	double basic_salary = 100000;
// 	double hra = 5000;
// 	double allowance = 1000;
// 	double gross_salary = basic_salary + hra + allowance;
// 	System.out.println("Basic salary = "+basic_salary);
// 	System.out.println("HRA = "+hra);
// 	System.out.println("Allowance = "+allowance);
// 	System.out.println("Gross salary = "+gross_salary);
// 	}
// 	}