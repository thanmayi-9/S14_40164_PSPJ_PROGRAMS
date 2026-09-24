import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
int n,num,x, rev= 0;
Scanner sc = new Scanner(System.in);
System.out.printf("Enter a number = ");
n = sc.nextInt();                                                                                                                       
num = n;

while(n>0){
x = n%10;
rev = rev+(x*x*x);
n = n/10;
}

if(rev == num){
System.out.println(num+" is an Armstrong");
}
else{
System.out.println(num+" is not an Armstrong");
}
sc.close();
}
}