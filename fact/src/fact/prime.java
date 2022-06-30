package fact;

public class prime {
//.................1b...........//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50,i;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=i+1;
		int c=2;
		while(c<=n/2 ) {
		for(i=c;i<n;i++) {
			if(arr[i]%c==0 && (arr[i]!=0)) {
				arr[i]=0;
			}
		}
		 c++;
		}
		
		for(i=1;i<n;i++) {
		   if(arr[i]!=0) {
			   System.out.print(arr[i]+" ");
		   }
		}
	}

}
