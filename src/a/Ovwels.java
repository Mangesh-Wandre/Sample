package a;

public class Ovwels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ov=str.charAt(i);
		if(ov=='a'||ov=='e'||ov=='i'||ov=='o'||ov=='u')
		{
			System.out.println("Pass");
			count++;
		}
		else
			System.out.println("Fail");
		
		}
		System.out.println(count);
	}

}
