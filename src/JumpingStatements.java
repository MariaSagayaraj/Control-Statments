
public class JumpingStatements {

	public static void main(String[] args) 
	{
		/*for(int i=1;i<=5;i++) 
		{
			if(i==5) 
			{
				break;
			}
			System.out.println(i);		
			
		}*/
		
		//O/p will be 1234 
		
		for(int i=1;i<=10;i++)
		{
			if(i==5) 
			{
				continue;
			}
			System.out.println(i);
		}


	}

}
