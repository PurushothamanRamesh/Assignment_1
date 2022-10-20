package com.name;

public class Assinment_1 
{
	public static void main(String[] args)
	{
		Name.MyName();
		System.out.println();
		First.NumberOne();
		System.out.println();
		First.NumberTwo();
		System.out.println();
		First.NumberThree();
		System.out.println();
		First.NumberFour();
		System.out.println();
		First.NumberFive();
		System.out.println();
	}
	
	
	public static class First 
	{
		public static  void NumberOne() 

	{
		int i,j,n;
		n=5;
		for(i=0;i<n;i++)
		{
		// Letter I
			for(j=0;j<n;j++)
			{
				if (i==0||i==(n-1)||j==((n-1)/2))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
		//big space
			for(j=0;j<n;j++)
			{
				if (j==0 ||j==(n-1) || i==j)
					System.out.print(" ");
				else
					System.out.print(" ");
			}
				
			
		//letter  N
			for(j=0;j<n;j++)
			{
				if (j==0 ||j==(n-1) || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		// space 
			for(j=0;j<n;j++)
			{
				if (j==0)
					System.out.print(" ");
				
			}
		//letter  E
			for(j=0;j<n;j++)
			{
				if (j==0 ||i==0||i==((n-1)/2) || i==(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		// space 
			for(j=0;j<n;j++)
			{
				if (j==0)
					System.out.print(" ");	
			}	
	    // Letter U
			for(j=0;j<n;j++)
			{
				if ((j==0 && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1)) || (j==(n-1) && i<(n-1)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			// space 
			for(j=0;j<n;j++)
			{
				if (j==0)
					System.out.print(" ");	
			}	
			//Letter R
		   for(j=0;j<n;j++)
		    {
			   	if ((i==0 && j<(n-1) ) || j==0 || (j==(n-1) && i>0 && i!=((n-1)/2)) || i==((n-1)/2) && j<(n-1))
	        		System.out.print("*");
	        	else
					System.out.print(" ");
			
		    }
		   //space 
		   for(j=0;j<n;j++)
			{
				if (j==0)
					System.out.print(" ");	
			}	
		   //Letter A
		   for(j=0;j<n;j++)
			{
				if ((i==0 && j>0&&j<(n-1)) || (j==0 && i>0) || (j==(n-1) && i>0) || i==((n-1)/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		   //space 
		   for(j=0;j<n;j++)
			{
				if (j==0)
					System.out.print(" ");	
			}	
		   //Letter N
		   for(j=0;j<n;j++)
			{
				if (j==0 ||j==(n-1) || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
	       }
	   }
		public static void NumberTwo()
		{
			int i,j,n;
			n=5;
			for(i=1;i<n;i++)
			{
				for (j=1;j<n;j++)
				{
					System.out.print(i);
				}
				System.out.println();		
			}
		}
		public static void NumberThree()
		{
			int i,j,n;
			n=14;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if (i==0||j==0||j==(n-1)||i==(n-1) ||((i+j)<= ((n-1)/2)) || ((j-i)>=((n-1)/2)))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		
		}
		public static void NumberFour()
		{
			int i,j,n;
			n=14;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if  ((j==0 && i>=((n-1)/2)) || i==(n-1) || (j==(n-1) && i>=((n-1)/2)) 
						||((i-j)>=((n-1)/2)) || (i+j>=(n+((n-1)/2)))
						
						)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				System.out.println();
			}
		}
		public static void NumberFive()
		{
			int i,j,n;
			n=14;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if (i==0||j==0||i==(n-1)|| ((i-j)>=((n-1)/2))|| ((i+j)<= ((n-1)/2)))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		
	}

	  public static class Name {
		public static void MyName()
		{ int i,j,n;
		n=5;
			for(i=0;i<n;i++)
			{
				// Letter P
				for(j=0;j<n;j++)
				{
					if (j==0||i==0 && j<(n-1) || j==(n-1) && i!=0 && i<(n-1)/2 || i==(n-1)/2 &&j<(n-1))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				//space 
				for(j=0;j<n;j++)
				{
					if (j==0)
						System.out.print(" ");
					
				}
				// Letter U
				for(j=0;j<n;j++)
				{
					if ((j==0 && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1)) || (j==(n-1) && i<(n-1)))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}

				//Letter R
				            for(j=0;j<n;j++)
				            {
				            	if ((i==0 && j<(n-1) ) || j==0 || (j==(n-1) && i>0 && i!=((n-1)/2)) || i==((n-1)/2) && j<(n-1))
				            		System.out.print("*");
				            	else
									System.out.print(" ");
				
				            }
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				// Letter U
							for(j=0;j<n;j++)
							{
								if ((j==0 && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1)) || (j==(n-1) && i<(n-1)))
									System.out.print("*");
								else
									System.out.print(" ");
							}
							
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				// Letter s
							for(j=0;j<n;j++)
							{
								if (i==0 || i==((n-1)/2) || i==(n-1) || j==0 && i<((n-1)/2) || j==(n-1) && i>=((n-1)/2) )
									System.out.print("*");
								else
									System.out.print(" ");
							}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				//letter H
							for(j=0;j<n;j++)
							{
								if (j==0||j==(n-1)||i==((n-1)/2))
									System.out.print("*");
								else
									System.out.print(" ");
							}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				// Letter O
							for(j=0;j<n;j++)
							{
								if (j==0&&i>0&&i<(n-1)||j==(n-1) && i>0&&i<(n-1) ||i==(n-1) && j>0&& j<(n-1) || i==0 && j>0&& j<(n-1))
									System.out.print("*");
								else
									System.out.print(" ");
							}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				// Letter T
							for(j=0;j<n;j++)
							{
								if (i==0 || j==((n-1)/2))
									System.out.print("*");
								else
									System.out.print(" ");
							}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				//letter H
							for(j=0;j<n;j++)
							{
								if (j==0||j==(n-1)||i==((n-1)/2))
									System.out.print("*");
								else
									System.out.print(" ");
							}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				//letter A
							for(j=0;j<n;j++)
							{
								if ((i==0 && j>0&&j<(n-1)) || (j==0 && i>0) || (j==(n-1) && i>0) || i==((n-1)/2))
									System.out.print("*");
								else
									System.out.print(" ");
							}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				//letter  M
							for(j=0;j<n;j++)
							{
								if (j==0 ||j==(n-1) || i==j && i>=0 && i<=((n-1)/2) || (i+j==(n-1) && i>=0 && i<=((n-1)/2)))
									System.out.print("*");
								else
									System.out.print(" ");
							}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				//letter A
							for(j=0;j<n;j++)
							{
								if ((i==0 && j>0&&j<(n-1)) || (j==0 && i>0) || (j==(n-1) && i>0) || i==((n-1)/2))
									System.out.print("*");
								else
									System.out.print(" ");
							}
				// space 
							for(j=0;j<n;j++)
							{
								if (j==0)
									System.out.print(" ");
								
							}
				//letter  N
							for(j=0;j<n;j++)
							{
								if (j==0 ||j==(n-1) || i==j)
									System.out.print("*");
								else
									System.out.print(" ");
							}
				
				          
				
				System.out.println();
		}

	}
	}
	
	
}

