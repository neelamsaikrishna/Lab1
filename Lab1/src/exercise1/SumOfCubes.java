package exercise1;
import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to sum of cubes: ");
		int num= sc.nextInt();
		System.out.println("Sum of the cubes the number "+num+" is: "+displaySum(num));
		}
		public static int displaySum(int num) {
		
		int sum=0;
		
		while(num!=0) {
			
			int digit= num%10;
			sum=sum+(int)Math.pow(digit, 3);
			num/=10;
		}
		return sum;
		

	}

}
