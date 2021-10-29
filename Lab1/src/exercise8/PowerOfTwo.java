package exercise8;
import java.util.*;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter number to check power of two: ");
		int n= scn.nextInt();
		if(checkNumber(n))
			System.out.println(n+" is a power of 2");
		else {
			System.out.println(n+" is not a power of 2.");
		}

	}
	
	//checking power of 2 or not
	
	static boolean checkNumber(int n) {
		
		if(n==0)
			return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
			n= n/2;
		}
		return true;
	}

}