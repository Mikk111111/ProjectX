import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mys = new Scanner(System.in);
		int n = mys.nextInt();
		int sk=0;
		int i=0;
		boolean isPrimary= isPrimary(n);
		for(int i=0;i<n;i++)
		{	
			if(sk%2==0||sk%3==0||sk%5==0)
			{
				//System.out.print(sk+",");
			}
			else
			{
				System.out.print(sk+",");
			}
			sk++;
		}
		
	}
	public static boolean isPrimary(int n)
	{
		boolean is = true;
		int divider=2;
		while(is&&divider<n)
		{
			is=(n%divider!=0);
			divider++;
		}
		return is;
	}

}
