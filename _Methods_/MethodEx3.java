class MethodEx3{

	// Main Method
	public static void main(String[] args) {
		for ( int i = 2; i<=50 ; i++ ) {
			isPrime(i);
		}
	}

	// User Defined Method
	public static void isPrime(int num)
	{
		boolean flag = true;
		for ( int i = 2 ; i<num ; i++ )
		 {
			
		 	if (num%i==0) {
		 		flag = false;
		 		break;
		 	}
		 }
		 if (flag) {
		 	System.out.println(num + " Is a Prime Number");
		 }else{
		 	System.out.println( num + " Is Not a Prime Number");
		 }
	}
}