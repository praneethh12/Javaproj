package fact;

import java.util.Scanner;
//............2b............//
public class arr2d {
	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Rows: ");
		r=sc.nextInt();
		System.out.print("Columns: ");
		c=sc.nextInt();
		int[][] arr=new int[r][c];
		int i,j;
		System.out.println("Enter the elements: ");
		for(i=0;i<r;i++) 
			for(j=0;j<c;j++) 
				arr[i][j]=sc.nextInt();
		System.out.println("Elements are: ");
		 for(i=0;i<r;i++) {
			 for(j=0;j<c;j++) 
				 System.out.print(arr[i][j]+ " ");
			 System.out.println();
		 }
		}
}
