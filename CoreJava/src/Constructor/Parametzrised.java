// Java Program to Illustrate Working of
// Parameterized Constructor
 
package Constructor;
import java.io.*;

class Paraargument{
	int num;
	String Name;
	Paraargument(int num, String Name)
	{
		this.num = num;
		this.Name = Name;
	}
	
}
public class Parametzrised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paraargument pa = new Paraargument(10,"Komal");
		System.out.println("Name: " +pa.Name  +  "Id:" + pa.num);
	}

}
