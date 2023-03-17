class Pattern17
{
	public static void main(String args[])
	{
		int k=0;
		int l=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				while(true)
				{
				k=k+l;
				System.out.print(k+" ");
				break;
				}
			}
			System.out.println("");
		}
	}
}