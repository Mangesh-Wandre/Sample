package a;

import java.util.Arrays;

public class Occurance {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aspire institue";
		char a[]=s.toCharArray();
		//String a[]=s.split("");
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			
			if(s.charAt(i)=='i')
			{
				System.out.println("Index of i is :-"+(i+1));
				count++;
			}
			
		}
		System.out.println("Number of Occurance of 'i' is :-"+count);
		
		

	}

}
