// Program To Check Even Odd
class MethodExample2{
	public static void main(String[] args) {
		
	for (int i = 2 ; i < 50 ; i++ ) {
		evenOdd(i);
	}
}
	public static void evenOdd(int num){
		if (num%2 == 0) {
			System.out.println(num + " Is a Even Number");
		}else{
			System.out.println(num + " Is Not a Even Number");
		}
	} 
	
}