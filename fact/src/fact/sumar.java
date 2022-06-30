package fact;

import java.util.Scanner;
//..............2a...........//
public class sumar {
     public static int sum(int arr[],int n) {
    	 int i=0,s=0;
    	 for(i=0;i<n;i++) {
    		 s=s+arr[i];
    	 }
    		 return s;
     }
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n,i,s;
	     n=sc.nextInt();
	     int[] arr=new int[n];
	        for(i=0;i<n;i++) {
	        	arr[i]=sc.nextInt();
	        }
	     s=sum(arr,n);
	     System.out.println("Answer is " + s);
	}
}
