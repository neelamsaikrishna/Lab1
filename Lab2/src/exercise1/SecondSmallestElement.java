package exercise1;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int[] arr= {5,10,2,4,6,8};
		int min1=arr[0],min2=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min1) {
				min1=arr[i];
			}
			else if(arr[i]<min2) {
				min2=arr[i];
				
			}
		}
		System.out.println("second smallest element is"+ min2);
	}
	}
