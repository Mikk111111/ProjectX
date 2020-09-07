import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mys = new Scanner(System.in);
		int n = mys.nextInt();
		int sk=0;
		int i=0;
		boolean isPrimary= isPrimary(n);
		
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
