// java program to illustrate calling no- argument constructor 
package Constructor;
import java.io.*;
class Noargument{
	int num;
	String Name;
	Noargument()
	{
		System.out.println("Constructor call");
	}
}


public class Demo_Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noargument na = new Noargument();
		// Default constructor provides the default
        // values to the object like 0, null
		System.out.println(na.num);
		System.out.println(na.Name);
	}

}
