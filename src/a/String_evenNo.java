package a;

import java.lang.reflect.Array;

public class String_evenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Mangesh@123456";
		System.out.println(s.charAt(3));
		String[] a=s.split("");
		int size=a.length;
		System.out.println(size);
		System.out.print("All Nos:-");
		for(int i=0;i<size;i++)
		{
		char d=s.charAt(i);
		if(d=='1' || d=='2' || d=='3' || d=='4' || d=='5' || d=='6')
		{
			if(d=='2' || d=='4' || d=='6')
			System.out.print(""+d+",");
			//System.out.println();
//			if(d=='1' || d=='3' || d=='5')
//				System.out.print("           "+d+",");
				
		}
		
	}
		System.out.println();
		for(int i=0;i<size;i++)
		{
		char d=s.charAt(i);
		if(d=='1' || d=='2' || d=='3' || d=='4' || d=='5' || d=='6')
		{
			if(d=='1' || d=='3' || d=='5')
			System.out.print(""+d+",");
			//System.out.println();
//			if(d=='1' || d=='3' || d=='5')
//				System.out.print("           "+d+",");
				
		}
		
	}

	}
}
