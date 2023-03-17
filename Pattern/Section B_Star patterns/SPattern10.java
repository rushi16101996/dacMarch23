class SPattern10
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}