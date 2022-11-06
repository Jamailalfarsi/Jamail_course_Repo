

import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class School {
	// protected void finalize() throws Throwable
	  //  {
	  //      try {
	 
	   //         System.out.println("inside demo's finalize()");
	    //    }
	     //   catch (Throwable e) {
	 
	     //       throw e;
	      //  }
	     //   finally {
	 
	       //     System.out.println("Calling finalize method"
	        //                       + " of the Object class");
	 
	            // Calling finalize() of Object class
	         //   super.finalize();
	       // }}
//	private static final char[]  = null;
	String schoolName;

	static boolean isExit = true;
	static boolean isExitSubject = true;

	List<Student> studentList = new ArrayList<>();
	Stack stk = new Stack();

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	// Getter
	public String getSchoolName() {
		return schoolName;
	}

	// Setter
	public void setSchoolName(String SN) {
		this.schoolName = SN;
	}
	   


	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stk = new Stack<>();
		Set<String> hashEmailSet = new HashSet<String>();
		Set<String> hashEmailSetU = new HashSet<String>();
		List<School> schoolList = new ArrayList<>();
		List<String> listDuplicateEmail = new ArrayList<>();
		boolean subMenuExit = true;
		
		boolean usepass = true;
		String username,password;
		
		while(usepass) {
			System.out.println("Enter Username");
			username = sc.nextLine();
		System.out.println("Enter Password");
			password = sc.nextLine();
			
			
			try {
				if(!username.equals("Jamail")){
					throw new Exception("username is not found");
					
					}
			
				else if(! password.equals("A12")){
					throw new Exception("password is not found");
				
				}
				
				
				else {
					System.out.println("username and password Successful welcome to main menue");

				}
				
				System.out.println("*********************************************");
		
		
		do {
			
			MainMenue menue=new MainMenue();
			menue.menueFunction();

			int studentMenue = sc.nextInt();      

			switch (studentMenue) {
			case 1:
				Registration studReg=new Registration();
				studReg.registrationStudent();
				break;
			case 2:
				// Printing elements of HashSet object
				System.out.println(hashEmailSetU);
				break;

			case 3:  		
				Email emailDup=new Email();
				emailDup.emailStudent();

				break;

			case 4:
				Report reportStudent=new Report();
				reportStudent.report();

				break;
			case 5:
				History historyStudent=new History();
				historyStudent.historyStac();	
				break;
			case 6:
				CurrencyStudent curencymount=new CurrencyStudent();
				curencymount.currency();
                         break;
							case 7:
			
				do {
					
					SubMenue menue2=new SubMenue();
					menue2.submenueFunction();

					int studentSubMenue = sc.nextInt();
					switch(studentSubMenue) {
					case 1:
						
						factorialNumber fact=new factorialNumber();
						fact.factorial();

						 break;
					case 2:
						
						FibonacciSeries fib=new FibonacciSeries();
						fib. fibonacci();
					
						break;
					case 3:
						subMenuExit = false;
						
						break;
					
				}
					}while(subMenuExit);
		
				
				break;
			
			
			}

		} while (true);
		
			}
			catch(Exception e){
				System.out.println("Execption:"+ e.getMessage() );
				
			}

			}
			
			
		usepass=false;
	}}

	
	
		
	


