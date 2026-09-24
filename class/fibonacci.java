public class fibonacci{
    public static void main(String[] args){
int term1 = 0;
int term2= 1;

for (int i = 0; i <=8 ; i++){
System.out.println(term1);
int term3 = term1 + term2;
term1 = term2;
term2 = term3;

} 
}
} 