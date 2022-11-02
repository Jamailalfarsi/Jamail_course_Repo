
import java.util.ArrayList;
import java.util.List;

public class Subject implements MarkInterface  {
	
	     
	     private String subName;
	      
	      List<Mark> listMark=new ArrayList<>();
		
	      public void pass(int mark) {
	    	  if(mark>=90) {
	    	  System.out.println("This Student is pass ");
	      }
	    	  else {
	    		  System.out.println("This Student is fail"); 
	    	  }
	      }

		    public List<Mark> getListMark() {
			return listMark;
		}

		public void setListMark(List<Mark> listMark) {
			this.listMark = listMark;
		}

			public String getSubName() {
		      return subName;
		    }
		    
		    // Setter
		    public void setSubName(String Sname) {
		      this.subName = Sname;
		    }
}



