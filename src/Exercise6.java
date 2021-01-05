/**
*Calculate difference between sum of square and square of sum
*author: Joel
*/

public class Exercise6{
	public static void main(String args[]) {
		int n=10;
		int sum = 0;
		int sumSq;
		int sumOfSq =0;;
		int difference;
		for(int i = 1; i <= n; i++){
			sum = sum + i;
			sumOfSq = sumOfSq + (i*i);
		}	
		sumSq = sum * sum;
		difference =  sumSq - sumOfSq; 
		System.out.print(difference);
		
		
			
		
		
		
	}
}