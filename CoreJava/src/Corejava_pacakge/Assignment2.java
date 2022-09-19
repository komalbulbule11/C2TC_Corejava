package Corejava_pacakge;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%3==0)
		{
			System.out.println("It is a multiple of 3");
		}
		else {
			System.out.println("It is not a multiple of 3");
		}
	}

}
