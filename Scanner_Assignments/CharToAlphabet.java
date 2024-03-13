// Write a java program to find wheather the char is alphabet or not 
// 65 - 90

// 97- 122
import java.util.*;

class CharToAlphabet{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charecter: ");
		char ch = sc.next().charAt(0);

		System.out.println((ch>=65 && ch<=99)||(ch>=97 && ch<=122)? "alphabet" : "not an alphabet");
		// System.out.println((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')? "alphabet" : "not an alphabet");
	}
}
