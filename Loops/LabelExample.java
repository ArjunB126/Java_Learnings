// import java.util.Scanner;

class LabelExample{
	public static void main(String[] args) {
		ram:{
		int i = 25;
		while(i>=20){
			System.out.println(i+" ");
			if (i==22) {
				break ram;
			  }
		 }
	   }
	}
}