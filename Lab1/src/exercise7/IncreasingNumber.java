package exercise7;
import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter  number  to check for increasing number: ");
		int number= scn.nextInt();
		
		if(checkNumber(number))
			System.out.println("Number is an increasing number.");
		else {
			System.out.println("Number is not an increasing number.");
		}

	}
	
	//check a number is in increasing order
	static boolean checkNumber(int number) {
		
		int lastDigit= number%10;
		number/=10;
		boolean flag= false;
		
		while(number>0) {
			if(lastDigit<=number%10) {
				flag=true;
				break;
			}
			
			
			lastDigit= number%10;
			number/=10;
				
		}
		if(flag) 
			return false;
		else {
			return true;
		}
		
		
		
	}

}
