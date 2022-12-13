package a;

public class Prime_No {

	boolean IsPrime(int no)
	{
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				return false;
				
			}
			
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=19;
		Prime_No p=new Prime_No();
		boolean res=p.IsPrime(num);
		if(res==true)
			System.out.println(num+" No. is Prime");
		else
			System.out.println(num+" No. is Not Prime");

	}

}
