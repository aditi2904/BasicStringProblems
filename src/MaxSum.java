import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String a=sc.next();
			String b=sc.next();
			if(a.length()==b.length())
				System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
			else if(a.length()<b.length())
				System.out.println(a);
		}

	}

}
