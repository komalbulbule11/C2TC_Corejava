package Corejava_pacakge;

public class Product_of_negative_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int negatives = 1;
		int num[]= {1,11,2,3,-4,-5,6,7,-8,9,15};
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0)
			{
				negatives*=num[i];
			}
		}
		System.out.println("The product of the negatives is"+ negatives);

	}

}
