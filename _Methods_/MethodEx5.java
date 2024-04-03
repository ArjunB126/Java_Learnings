// Program to understand flow of execution of Methods [ How method Call Each Others ]

class MethodEx5{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		darshan();
		ramesh();
		ganesh();
		System.out.println(" Main Ends");
	}

	public static void ramesh(){
		System.out.println(" Ramesh Starts ");
		darshan();
		System.out.println(" Ramesh Ends ");
	} 
	public static void ganesh(){
		System.out.println(" Ganesh Starts ");
		ramesh();
		System.out.println(" Ganesh Ends ");
	}
	public static void darshan(){
		System.out.println(" Darshan Starts ");
		System.out.println(" Darshan Ends ");
	}
}