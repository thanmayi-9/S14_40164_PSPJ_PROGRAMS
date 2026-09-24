import java.util.*;
public class power{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("X : ");
int x = sc.nextInt();
System.out.print("Y : ");
int y = sc.nextInt();

int result = 1;

for(int i =1;i<=y; i++){
result = result*x;
}
System.out.print("Result = "+result);
sc.close();
}
}