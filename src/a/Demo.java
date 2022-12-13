package a;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AaBbCcDdEeZz";
		String a[]=s.split("");
		String str1="";
		String str2="";
		for (int i = 0; i < a.length; i++)
		{
			char d=s.charAt(i);
		if('a'<=d && d<='z'  )
			str1=str1+d;
		 if('A'<=d && d<='Z')
				str2=str2+d;
			
		}	
		
//		for(int i=0;i<=s.length()-1;i++)
//		{
//			char c=s.charAt(i);
//			if('0'<=c && c<='9')
//				
//				s1=s1+c;
//			if('a'<=c && c<='z' || 'A'<=c && c<='Z')
//				s2=s2+c;
//			//System.out.println();
//		}
		System.out.println("Lower:-"+str1);
		System.out.println("Upper:-"+str2);
	}
		
}

