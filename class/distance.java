import java.util.Scanner;
public class distance{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.printf("Enter speed of vehicle = ");
int speed = sc.nextInt();
System.out.printf("Enter time(hours) taken by vehicle = ");
float time = sc.nextFloat();

float distance = speed * time;
System.out.println("Speed of vehicle = "+speed+"km/h");
System.out.println("Time(hours) taken by vehicle = "+time+"hrs");
System.out.println("Distance = "+distance+"km");

sc.close();

}
}
