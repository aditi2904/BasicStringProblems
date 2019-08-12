import java.util.Arrays;
import java.util.Scanner;

public class MxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int m=sc.nextInt();
			int a[]=new int[m];
			for(int j=0;j<m;j++)
				{a[j]=sc.nextInt();
				}
				
			Arrays.sort(a);
			System.out.print(a[m-2]*a[m-1]);
		}
		

	}

}
