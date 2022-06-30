package fact;

import java.util.Scanner;
import fact.packi;
import java.io.*;
import java.util.Random;
class area {
	int a,b;
	
	 area(int a) {
		 System.out.println("Area of square: "+ a*a);
	}
	 area(int a,int b) {
		 System.out.println("Area of rectangle: "+ a*b);
	}
	 area(double a) {
		float c;
		c=(float)(3.14*a*a);
		 System.out.println("Area of circle: "+ c);
	}
}
interface test {
	  void square();	 
}

class Arithmetic implements test{
	int a;
	Arithmetic() {
		this.a=0;
	}
	Arithmetic(int a) {
		this.a=a;
//		  System.out.println(this.a*this.a);
	}
      public void square() {
    	  System.out.println(this.a*this.a);
      }
}
class ToTestInt {
	int a;
	ToTestInt() {
		this.a=0;
	}
	ToTestInt(Arithmetic obj) {
		this.a=obj.a;
		System.out.println(this.a*2);
	}
	
}

class show {
	public void print(int a) {
		System.out.println("Given value square is "+ (a*a));
	}
}

class showagain extends show {
//	public void print(int a) {
//		System.out.println("This time is cube time "+ (a*a*a));
//	}
	 int num;
	 String s;
     showagain(int num,String s) {
    	 this.num=num;
    	 this.s=s;
     }
     public void print() {
 		System.out.println("num is "+ num + " String could be "+ s);
 	}
}

class againshow extends showagain {
	againshow(int num,String s) {
		super(num,s);
	}
      public void display() {
    	  System.out.println("num is "+ num + " String is "+ s);
      }
}

class thread1 extends Thread {
    Random random= new Random(); 
	int no,i;
	thread1() { 
		Thread t=new Thread(this,"1st");
	}
	
	public void run() {
		try {
			for(i=0;i<5;i++) {
			no=random.nextInt();
			if(no<0)
				no=no*-1;
			System.out.println("The number is "+no%20);
			thread2 th2=new thread2(no%20);
			th2.start();
			thread3 th3=new thread3(no%20);
			th3.start();
			sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
		
	}
}

class thread2 extends Thread {
	int no;
	thread2(int no) {
	this.no=no;
	}
	public void run() {
		try {
			System.out.println("Thread 2 is "+this.no*this.no);
			//sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

class thread3 extends Thread {
	int no;
	thread3(int no) { this.no=no; }
	public void run() {
		try {
			System.out.println("Thread 3 is "+this.no*this.no*this.no);
		//	sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class allinone {

	public static void main(String[] args) 
			//throws ClassNotFoundException
	{
		
		Scanner sc=new Scanner(System.in);
		
		//.............................................................//
		 
		 int a,a1,b;                                                 //4a
		 double d;
		 System.out.print("Enter side of square ");
		 a=sc.nextInt();
		 area ar1=new area(a);
		 System.out.print("Enter sides of rectangle ");
		 a1=sc.nextInt();
		 b=sc.nextInt();
		 area ar2=new area(a1,b);
		 System.out.print("Enter radius of circle ");
		 d=sc.nextDouble();
		area ar3=new area(d);
		
		 
		//............................................................//
		
		/*int a=6;                  //4b
		show obj=new show();
		obj.print(a);
		showagain obj1=new showagain();
		obj1.print(a);
		*/
		//...................................................................//
//		showagain obj1=new showagain(5,"String12");  //single-level    //5a
//		obj1.print();
//		againshow mult=new againshow(9,"Over");   //multi-level        //5b
//		mult.display();
		//..............................................................//
//		packi packi = new packi();         //6
//		int c=packi.add(5, 6);
//		System.out.println(c);
//		packi.Display("Praneeth", "Likku");
		//.............................................................//
//		 Arithmetic ai=new Arithmetic(5);         //7
//		 ai.square();
//		 ToTestInt ci=new ToTestInt(ai);
		//.............................................................// 
		            	
//		try {
//		 Class temp = Class.forName("Exception");            //8
//		}
//		catch(ClassNotFoundException obj) {
//			System.out.println("This is exception");
//		}
		
//		try {
//			int b=5/0;
//		}
//		catch(Exception obj) {
//			System.out.println("This is exception-"+obj);
//		}
//		System.out.println("This is exception-");
		//.............................................................//
//		try {                                                
//			throw new ArithmeticException("newException");     //9
//		}
//		catch(ArithmeticException obj) {
//			System.out.println("this is "+ obj);
//		}
		//...........................................................//
	//	thread1 th=new thread1();                      //10
	//	th.start();
		//..............THE   END......................................//
	}
}
