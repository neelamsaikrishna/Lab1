package exercise3;

import java.util.Scanner;

public class FibanociiSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num =sc.nextInt();
		
		 System.out.println(recursive(num));
		 System.out.println(nonrecursive(num));
			}
		 static int recursive(int num) {
			 if(num == 1) return 1;
			 if(num == 0) return 0;
			 return recursive(num-1)+ recursive(num-2);
		 	}
			 static int nonrecursive(int num) {
				int a= 1, b = 1, c;
				int count = 2;
				while(count<num) {
					count++;
					c = a+b;
					a = b;
					b = c;
			  }
    	  return b;

	}

}
