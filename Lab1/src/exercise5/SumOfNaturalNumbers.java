package exercise5;
import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter number: ");
		int n= scn.nextInt();
		System.out.println("Sum of natural numbers is: "+ calculateSum(n));

	}
	
	//Calculate Sum
	static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;
		

	}

}
