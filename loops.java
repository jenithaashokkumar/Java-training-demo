package automation;

public class loops {

	public static void main(String[] args) {
		
		int k = 1;
		for  (int i=0; i<=4; i++)
		{
		//	System.out.println("Outer loop stated successfully");
			for (int j=0; j<=4-i; j++)
			{
			//	System.out.println("inner loop stated ");	
			System.out.print( "* ");
			k++;
			}
			System.out.println(" ");
		}
		

	}

}
