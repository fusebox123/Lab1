/**
*Sum of cubes of digits in a number
*author: Joel
*/

public class Exercise1{
	public static void main(String args[]) {
		int n=222;
		int sum=0;
		int rem;
		
		while(n!=0){
			rem = n%10;
			n=n/10;
			sum = sum + rem*rem*rem;
			
			
		}
		System.out.print(sum);
		
		
			
		
		
		
	}
}