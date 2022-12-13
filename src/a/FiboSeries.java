package a;

import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0,Rang;
		System.out.println("Enter Range of Fibonancy Series :-");
		Scanner sc=new Scanner(System.in);
		Rang=sc.nextInt();
		System.out.print(a+","+b+",");
		for (int i = 0; i < Rang-2; i++) 
		{
			
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+",");
		}
		

	}

}
