/**
*Sum of Numbers Divisible by 3 or 5
*author: Joel
*/

public class Exercise5{
	public static void main(String args[]) {
		int n = 50;
		int sum = 0;
		for(int i = 1;i < n; i++){
				if(i % 3 == 0 && i % 5 == 0){
					sum = sum + i;
				}
		}
		System.out.print(sum);
	}
}