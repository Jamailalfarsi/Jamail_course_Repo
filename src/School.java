

import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class School {

//	private static final char[]  = null;
	String schoolName;
//	   int currency;
//	   double feesAmount=0;
//	   double amountCal=0;
//	   double amount;

	static boolean isExit = true;
	static boolean isExitSubject = true;

	List<Student> studentList = new ArrayList<>();
	Stack stk = new Stack();

//	     Map<String, Double>currencyMap = new HashMap<>();
//	     Map<String, Map<String, Double>>comparisionMap = new HashMap<>();

//	     List<Mark> listDuplicateEmail=  new ArrayList<>();

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

	static void menueFunction() {
		System.out.println("Select one of the options:");
		System.out.println("1. Registeration");
		System.out.println("2. Print Email");
		System.out.println("3. Print Repeated Email");
		System.out.println("4. Report");
		System.out.println("5. History");
		System.out.println("6. Currency");
		System.out.println("7. Factorial and Fibonacci series");
		//System.out.println("8. *********");
	}
	static void submenueFunction() {
		System.out.println("\n");
		System.out.println("Select one of the options:");
		System.out.println("1. Factorial:");
		System.out.println("2. Fibonacci series:");
		System.out.println("3. Back to main menue");
		//Thank you
	}
	
	public static int factorial(int n) {
	if (n==1) {
		return 1;
	}
	else {
		return n*factorial(n-1);
	}
	}
	
	
	
	

	public static void main (String[] args) {
		
		
	
		
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stk = new Stack<>();
		Set<String> hashEmailSet = new HashSet<String>();
		Set<String> hashEmailSetU = new HashSet<String>();
		List<School> schoolList = new ArrayList<>();
		List<String> listDuplicateEmail = new ArrayList<>();
		boolean subMenuExit = true;
		int currency;
		double feesAmount = 0;
		double amountCal = 0;
		double amount;
				
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
			menueFunction();

			int studentMenue = sc.nextInt();
//	         studentMenue = Integer.parseInt(studentMenueM);
//	         List<School> schoolList=new ArrayList<>();

			switch (studentMenue) {
			case 1:
//		    	 Stack<String> stk = new Stack<>();
//			    	Scanner sc =new Scanner (System.in); 
//			    	
//			    	School schObj = new School(); // object for school 
////			  	  List<School> schoolList=new ArrayList<>();
//			  	  System.out.println( "Enter School Name: ");
//			   	  String schInput = sc.next();
//			   	  stk.push(schInput);

//			   	System.out.println( "Enter Email: ");
//			   	  String emailInput = sc.next();
//			   	  hashEmailSet.add(emailInput);
//			   	  
//			   		schObj.setSchoolName(schInput);// object chaining
//			    	schoolList.add(schObj);
				isExit = Boolean.TRUE;
				School schObj = new School(); // object for school
//			  	  List<School> schoolList=new ArrayList<>();
					System.out.println("Enter School Name: ");
					String schInput = sc.next();
					stk.push(schInput);

					schObj.setSchoolName(schInput);// object chaining
					schoolList.add(schObj);
					
				while (isExit) {
					

					Student studentObj = new Student();// student object

					System.out.println("Enter student name:");
					String stuName = sc.next();
					stk.push(stuName);
					studentObj.setStudentName(stuName);
					schObj.studentList.add(studentObj);
					studentObj.work();//Interface method
					studentObj.study();//Interface method
					System.out.println("Enter student first name:");
					String stufName = sc.next();
					stk.push(stufName);
					System.out.println("Enter student last name:");
					String stulName = sc.next();
					stk.push(stulName);
					studentObj.firstLastName(stufName,stulName);
					System.out.println(studentObj.firstLastName(stufName+" ",stulName));
					
					System.out.println("Enter student Age:");
					Integer stuAge = sc.nextInt();
					//stk.push(stuAge);
					//stSudentObj.studentAge(stuAge );
					System.out.println(studentObj.studentAge(stuAge ));
					
					System.out.println("Enter Email:");
					String emailInput = sc.next();
					stk.push(emailInput);
					studentObj.setStudentEmail(emailInput);
					schObj.studentList.add(studentObj);
					listDuplicateEmail.add(emailInput);
//			   	 Set<String> hashEmailSetU = new HashSet<String>();
					hashEmailSetU.add(emailInput);
//				   	List<String> listDuplicateEmail=  new ArrayList<>();
//				    System.out.println("choose Currency:\n"+"1-KWD \n" +" 2-AED \n" +" 3-USD \n" +" INR \n");
//
//	                 currency = sc.nextInt();
//
//	                 System.out.println("Enter Student Fees Amount");
//
//	                 feesAmount= sc.nextDouble();
//
//	                 
//
//	                 if( currency == 1) {
//
//	                	 amountCal= feesAmount*0.80;
//
//	                 }
//
//	                 else if(currency == 2) {
//
//	                	 amountCal= feesAmount*9.54;
//
//	                 }
//
//	                 else if(currency == 3) {
//
//	                	 amountCal= feesAmount*2.60;
//
//	                 }
//
//	                 else if(currency == 4) {
//
//	                	 amountCal= feesAmount*214.80;
//
//	                 }
					

					isExitSubject = Boolean.TRUE;
					
					while (isExitSubject) {
						Subject subjectObj = new Subject();// object for subject
						System.out.println("Enter Subject Name: ");
						String subInput = sc.next();
						subjectObj.setSubName(subInput);
						stk.push(subInput);

						Mark markObj = new Mark(); // object for mark
						System.out.println("Enter Marks: ");
						Integer markInput = sc.nextInt();
						String m = Integer.toString(markInput);
						markObj.setSubMark(markInput);
						stk.push(m);

						subjectObj.listMark.add(markObj);
						studentObj.listSubject.add(subjectObj);

						System.out.println("press 1 to add new subject , press 0 to exit");
						int exitInput = sc.nextInt();

						String v = Integer.toString(exitInput);
						stk.push(v);
						if (exitInput == 0) {

							isExitSubject = false;
						}
					}
					System.out.println("press 1 to add new student , press 0 to exit");
					int exitInput2 = sc.nextInt();
					String b = Integer.toString(exitInput2);
					stk.push(b);
					if (exitInput2 == 0) {
						isExit = false;
					}
					
					try {
						FileOutputStream fout=new FileOutputStream("C:\\Users\\user021\\eclipse-workspace\\history.txt");
						ObjectOutputStream out =new ObjectOutputStream(fout);
						out.writeObject(stk);
						out.flush();
						out.close();
						
					}
					catch(IOException e) {
						e.printStackTrace();
					}
					
				}
				break;
			case 2:
				// Printing elements of HashSet object
				System.out.println(hashEmailSetU);
//	    	        Set<String> hashEmailSetU = new HashSet<String>();
				break;

			case 3:
//	    		 List<String> listDuplicateEmail=  new ArrayList<>();
				for (String email : listDuplicateEmail) {
					if (hashEmailSet.add(email) == false) {
						System.out.println("Deplicate email is: " + " " + email);
					}
				}

				break;

			case 4:
				System.out.println("___ ++++Report:++++___");// for each method for array list
				for (School sch : schoolList) {
					System.out.println(sch.schoolName);
					for (Student h : sch.studentList) {
						System.out.println(
								"Student Name :" + h.getStudentName() + "\n The Email is :" + h.getStudentEmail());
						for (Subject j : h.listSubject) {
							for (Mark m : j.getListMark()) {
								System.out.println("Student mark of " + j.getSubName() + ":" + " " + m.getSubMark());
								//System.out.println("\tStudent Fees Amount: " + amountCal + "OMR");

							}
						}
					}
				}

				break;
			case 5:

				System.out.println("***** The history is ******");
				// printing history
				while (stk.empty() == false) {
				System.out.println(stk.pop());
				// {@code true} if and only if this stack contains
					// no items; {@code false} otherwise.
		
			}
				try {
					
				ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\user021\\eclipse-workspace\\history.txt"));
				Stack<String> stk1  =(Stack<String>)in.readObject();
				System.out.println(stk1);
				
				in.close();
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
				break;
			case 6:
				Map<String, Double> currencyMap = new HashMap<>();
				Map<String, Map<String, Double>> comparisionMap = new HashMap<>();

				String currencyName = "KWD";

				System.out.println("Enter student name who want to convert:");
				

				String studentConversionName = sc.next();
				stk.push(studentConversionName);

				System.out.println("Choose Currency you want to convert:\n" + "1-KWD \n" + " 2-AED \n" + " 3-USD");

				currency = sc.nextInt();
				String s = Integer.toString(currency);
				stk.push(s);
				

				System.out.println("Enter Fees Amount");

				feesAmount = sc.nextDouble();
				String s1 = Double.toString(feesAmount);
				stk.push(s1);
				

				if (currency == 1) {

					amountCal = feesAmount * 0.80;
					Math.round(amountCal);

				}

				else if (currency == 2) {

					amountCal = feesAmount * 9.54;
					currencyName = "AED";

				}

				else if (currency == 3) {

					amountCal = feesAmount * 2.60;
					currencyName = "USD";
					
				}
			

				currencyMap.put(currencyName, amountCal);
				comparisionMap.put(studentConversionName, currencyMap);
//	    		System.out.println( currencyMap);

				
				System.out.println(comparisionMap);

							case 7:
			
				do {
					submenueFunction();

					int studentSubMenue = sc.nextInt();
					switch(studentSubMenue) {
					case 1:
						
						
						
						System.out.println("Enter the number of factorial:");
						int userInput =sc.nextInt();
						long resultOfFactorial=factorial(userInput);
						System.out.println("factorial("+userInput+"!"+")=" + userInput+"*factorial("+(userInput-1)+"!"+")");
						System.out.println(resultOfFactorial);
					//    int fact =1 ;
					//    for(int i=1; i<=userInput; i++)
					//	{
					// 	  fact= fact *i;
					//	  System.out.println(i);
					//	}
						
					//    System.out.println("Factory of: \t"+ userInput+"\t is :\t"+fact);
						

						 break;
					case 2:
						

						System.out.println("Enter the number of Fibonacci Series :");
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

	
	
		
	


