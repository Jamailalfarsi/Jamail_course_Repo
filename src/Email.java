import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Email {
	
Set<String> hashEmailSet = new HashSet<String>();
List<String> listDuplicateEmail = new ArrayList<>();	
Set<String> hashEmailSetU = new HashSet<String>();
	
public void emailStudent() {
	System.out.println(hashEmailSetU);
	for (String email : listDuplicateEmail) {
		if (hashEmailSet.add(email) == false) {
			System.out.println("Deplicate email is: " + " " + email);
		}
	}
}
}
