package exercise2;

import java.util.Scanner;


public class TrafficLight {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1 red");
			System.out.println("2 yellow");
			System.out.println("3 Green");
			System.out.println(" choose color");
			int num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("stop");
				break;
			case 2:
				System.out.println("ready");
				break;
			case 3:
				System.out.println("go");
				break;
			default:
				System.out.println("enter valid number");
			}
			
			
			}
	}
