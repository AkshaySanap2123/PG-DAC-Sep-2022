public class As7
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)//row
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}