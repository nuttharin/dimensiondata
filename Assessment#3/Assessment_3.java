import java.util.Scanner;

public class Assessment_3 {

	public static String AlphabetSoup(String str){
		String sortStr = "" ;
		char[] strTemp = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			strTemp[i] = str.charAt(i) ;
		}
		
		for (int i = 0; i < strTemp.length -1 ; i++) 
		{
			for(int j = 0 ; j < strTemp.length-1-i ; j++)			{
				
				if((int)strTemp[j] > (int)strTemp[j+1]) 
				{
					char temp = strTemp[j+1] ;					
					strTemp[j+1] = strTemp[j] ;		
					strTemp[j] = temp ;
				}
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			sortStr +=  strTemp[i] ;
		}
      
		return sortStr ;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str ;	
		System.out.print("Input : ");
		str = input.nextLine();
		System.out.print("Output : "+AlphabetSoup(str));
	}

}
