package Assignments;

public class CountDigits {

	public static void main(String[] args) 
	{
		int i=22358;
		int count=0;
		
		while(i!=0) 
		{
			i /=10;
			count++;	
		}
		System.out.println("The no of digits is" +" " +count);
	}

}
