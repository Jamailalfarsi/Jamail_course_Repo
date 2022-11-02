
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements StudentInterface {
	
	

	     String studentName;
	     String studentEmail;
	     double studentCurrency;
	     String firstName;
         String lastName;
         
	     List<Subject> listSubject=  new ArrayList<>();
	     
	     @Override
	   public void work(){
		   System.out.println("this student is working");
	   }
	     @Override
	   public void study() {
		   System.out.println("this student is studing");
	   }
	     @Override
	   
	     public String firstLastName(String firstName,String lastName) {
	    	 String fullName = firstName + lastName;
		  return fullName;
	   }
	     @Override
	     public int studentAge(int age) {
	    	 if(age<=20) {
	    		 System.out.println("This student can registration");
	    	 }
	    	 else
	    		 System.out.println("This student can't registration");
			 
	    	 return age;
	     }
	  
		
	    public void setListSubject(List<Subject> listSubject) {
	    	this.listSubject=listSubject;
	    }
	    public List<Subject> getListSubject(){
	    	return listSubject;
	    }
	 // Getter
	    public String getStudentName() {
	      return studentName;
	    }
	    
	    // Setter
	    public void setStudentName(String studentName) {
	      this.studentName = studentName;
	    }
	    // Getter
	    public String getStudentEmail() {
	      return studentEmail;
	    }
	    
	    // Setter
	    public void setstudentCurrency(double studentCurrency) {
	      this.studentCurrency = studentCurrency;
	    }
	 // Getter
	    public double getstudentCurrency() {
	      return studentCurrency;
	    }
	    
	    // Setter
	    public void setStudentEmail(String studentEmail) {
	      this.studentEmail = studentEmail;
	    }
	    // Hello
}