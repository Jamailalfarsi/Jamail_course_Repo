
import java.util.ArrayList;
import java.util.List;

public class Student implements StudentInterface{
	
	

	     String studentName;
	     String studentEmail;
	     double studentCurrency;

	     List<Subject> listSubject=  new ArrayList<>();
	     
	   public void work(){
		   System.out.println("this student is working");
	   }
	   public void study() {
		   System.out.println("this student is studing");
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