import java.util.Arrays;
import java.util.Scanner;

public class Isogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			char a[]=s.toCharArray();
			Arrays.sort(a);
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[j+1])
					flag=false;
				break;
			}
			if(flag==false)
				System.out.println("1");
			else
				System.out.println("0");
		}

	}

}
