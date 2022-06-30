package fact;
 //........1a......//
public class facto {
	public static void main(String[] args) {
		int n=4,fac=1;
		System.out.println("Enter the value: ");
		int i=1;
	   while(n!=0) {	
		   fac=fac*i;
		   i++;
		   n--;
	   }
	   System.out.println("Answer is " + fac);
	}
}
