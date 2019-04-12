import java.util.Scanner;
public class Assessment_2 {

	
	public static String FirstReverse(String str) {
		String reStr = "";

		for (int i = str.length() -1  ; i >= 0 ; i--) {
			reStr += str.charAt(i) ; 
		}
		return reStr ;
    }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str ;	
		System.out.print("Input : ");
		str = input.nextLine();
		System.out.print("Output : "+FirstReverse(str));

	}

}
