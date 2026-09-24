public class methods {
    
	static int add(int x, int y){
		int c = x+y;
		return c;
	}
	static int multiplication(int x,int y){
		int c = x*y;
		return c;
	}
	public static void main(String[] args){
		int adddition = add(10,5);
		int multiple = multiplication(2,3);
		System.out.println("Addition = "+adddition);
		System.out.println("Multiplication = "+multiple);
	}
}


// public class methods{
// 	static void square(int n){
// 		System.out.println(n*n);
// 	}
// 	public static void main(String[] args){
// 		square(5);
// 	}
// }
