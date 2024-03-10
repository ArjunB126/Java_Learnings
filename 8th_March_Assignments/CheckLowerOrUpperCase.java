import java.util.Scanner;

// 97-122
// 65-90

class CheckLowerOrUpperCase{
	public static void main(String[] args) {
			Scanner  sc = new Scanner (System.in);
			System.out.println("Enter The Charecter You Want To Check :");
			char ch = sc.next().charAt(0);

			System.out.println((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? ((ch>='A' && ch<='Z')?"UpperCase Alphabet":"Lower Case Alphabet") : "The Given Character is Not An Alphabet");


	}
}