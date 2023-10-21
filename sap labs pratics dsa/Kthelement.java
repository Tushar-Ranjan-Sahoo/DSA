import java.util.Arrays;
import java.util.Collections;

class Kthelement{

	public static int kthSamllest( Integer[] arr, int k, int n  ){
		
		Arrays.sort(arr);

		return arr[n-k];
	}
	public static void main(String[] args){
		Integer arr[] = new Integer[] {12,3,5,7,19};
		int k = 1 ;
		int n = 5;

                 System.out.print(" Kth Smalleest element is  " + kthSamllest( arr,k , n));
	} 	
}