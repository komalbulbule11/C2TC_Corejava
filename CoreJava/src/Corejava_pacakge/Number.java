package Corejava_pacakge;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0)
		{
			System.out.println("Number is Positive:"+n);
		}
		if(n<0)
		{
			System.out.println("Number is Negative:"+n);
		}
		else if(n==0)
		{
			System.out.println("Number is Zero:"+n);
		}
	}

}
