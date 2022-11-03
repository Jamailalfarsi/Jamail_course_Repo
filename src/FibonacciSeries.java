import java.util.Scanner;

public  class FibonacciSeries {
	
	public void fibonacci() {
	System.out.println("Enter the number of Fibonacci Series :");
	Scanner sc = new Scanner(System.in);
	int userInput1 =sc.nextInt();
	

	long n1=0,n2=1,n3,i,count=userInput1;   
	
	 System.out.print(n1+" "+n2);//display 0 and 1
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print( " "+n3);    
	  n1=n2;    
	  n2=n3; 

}
	}
}
