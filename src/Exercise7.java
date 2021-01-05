/**
*Check if Increasing Number
*author: Joel
*/

public class Exercise7{
	public static void main(String args[]) {
		int n=654321;
		int digit;
		boolean isInc = false;
		while(n!=0){
		digit = n % 10;
		n = n/10;
				if(digit <= n % 10){
				isInc = true;
				break;
				}
		}
		if(isInc) System.out.print("Decreasing");
		else System.out.print("Increasing");
		
		
		
			
		
		
		
	}
}
