package exercise4;

public class DuplicateElements {
	public static int DuplicateElementsRemove(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
        
	}
	public static void main(String[] args) {
	
	     int arr[] = {10,30,30,40,40,78,78,9,9,90,90,};  
	        int length = arr.length;  
	        length = DuplicateElementsRemove(arr, length);  
	        
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
	}
}