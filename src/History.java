import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Stack;

public class History {
	public void historyStac() {
		System.out.println("***** The history is ******");
		// printing history
		Stack stk = new Stack();
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

}
}