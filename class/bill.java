//import java.lang.*;
public  class bill {
public static void main(String[ ] args){
float laptop = 45000;
float mouse = 500;
float keyboard = 1500;

float sum = laptop + mouse + keyboard;
float gst = sum * 18/100;
float total = sum + (sum * 18/100);

System.out.printf("Total bill = %.2f ",total);
System.out.printf("GST = %.2f ",gst);
}
}