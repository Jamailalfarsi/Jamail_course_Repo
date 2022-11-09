import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Registration {
	static boolean isExit = true;
	static boolean isExitSubject = true;
	List<School> schoolList = new ArrayList<>();
	List<String> listDuplicateEmail = new ArrayList<>();
	Set<String> hashEmailSet = new HashSet<String>();
	Set<String> hashEmailSetU = new HashSet<String>();
	String emailInput;
	
	public void registrationStudent(){
	
	Scanner sc = new Scanner(System.in);
	isExit = Boolean.TRUE;
	School schObj = new School(); // object for school	
	Stack stk = new Stack();
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
		 emailInput = sc.next();
		stk.push(emailInput);
		studentObj.setStudentEmail(emailInput);
		schObj.studentList.add(studentObj);
		listDuplicateEmail.add(emailInput);
//   	 Set<String> hashEmailSetU = new HashSet<String>();
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
}

