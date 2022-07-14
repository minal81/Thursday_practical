class DeepTech
{
public static void main(String arg[])
    {
		int i;
		for(i=1;i<=100;i++)
		{
			  if(i%3==0 && i%5==0)
				    {
				      System.out.println("multiple by 3 Deep");
				    }
			  else if(i%3==0)
				    {
				      System.out.println("multiple by 5 Tech");
				    }
			  else if(i%5==0)
				    {
				      System.out.println("multiple by 3 & 5 DeepTech");
				    }
			  else
				   {
					System.out.println(i);
				    }

		}

	}
}
