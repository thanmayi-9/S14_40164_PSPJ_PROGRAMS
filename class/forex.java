import java.util.Scanner;
public class forex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of rows : ");
        int rows = sc.nextInt();
        for(int i =0; i<=rows; i++){
            for(int j =0; j<=rows-i; j++){
                System.out.printf("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
