import java.util.Scanner;
public class parking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of hours of parking = ");
        int parking = sc.nextInt();
        int waterlevel = sc.nextInt();
        if(parking > 8 ){
            System.out.println(" eligible for extended parking ");
        }
        else{
            System.out.println("Regular parking");
        }
        if(waterlevel >= 5000){
            System.out.println("Sufficient Water Available");
        }
        else{
            System.out.println("Low water level available");
        }
            sc.close();
        }
    }









