package fact;
import java.util.*;
import java.util.Scanner;
  //...........3.............//
 class students {
	int usn;
//	char name[]=new char[15];
//	char branch[]=new char[10];
	String name;
	String branch;
	String phone;
	


      students (int i) {

	// System.out.println("Student "+ i+ " detail");
	 Scanner bc=new Scanner(System.in);
	System.out.println("USN ");
	 this.usn=bc.nextInt();
	System.out.println("Name ");
	 this.name=bc.next();
	System.out.println("Branch" );
	this.branch=bc.next();
	System.out.println("Phone" );
	this.phone=bc.next();
}
  void print(int i) {
	  System.out.println("Student "+ (i+1)+ " detail");
	  System.out.println("USN "+ this.usn);
	  System.out.println("Name "+ this.name);
	  System.out.println("Branch "+ this.branch);
	  System.out.println("Phone "+ this.phone);
  }
  
}
public class obj {                                    
	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		students stu[]=new students[n];
		System.out.println("Enter student details");
		for(i=0;i<n;i++) {
			stu[i]=new students(i);
		}
		for(i=0;i<n;i++) {
			stu[i].print(i);
		}
			
	}
}
