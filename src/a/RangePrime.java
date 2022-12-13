package a;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class RangePrime {

	 void PrimeFromTo(int min,int max)
	{
		for(int i=min; i<=max; i++)
		{
			for(int j=2;j<max/2;j++)
			{
				if(i%j==0)
				{
					//System.out.println("Not Prime");
					break;
				}
				else
				System.out.println("Prime"+i);
				break;
				
			}
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max;
		RangePrime o=new RangePrime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Range Frome To Find Prime");
		min=sc.nextInt();
		max=sc.nextInt();
		o.PrimeFromTo(min,max);
		
				
		

	}

}
