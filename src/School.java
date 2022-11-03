

import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class School {
	 protected void finalize() throws Throwable
	    {
	        try {
	 
	            System.out.println("inside demo's finalize()");
	        }
	        catch (Throwable e) {
	 
	            throw e;
	        }
	        finally {
	 
	            System.out.println("Calling finalize method"
	                               + " of the Object class");
	 
	            // Calling finalize() of Object class
	            super.finalize();
	        }}
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
//	         studentMenue = Integer.parseInt(studentMenueM);
//	         List<School> schoolList=new ArrayList<>();

			switch (studentMenue) {
			case 1:
	    	
				isExit = Boolean.TRUE;
				School schObj = new School();
				// object for school			  	 
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
						subjectObj.pass(markInput);
						

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
//	    		
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

	
	
		
	


