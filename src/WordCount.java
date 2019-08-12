import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			char a[]=s.toCharArray();
			int count=1;
			for(int j=0;j<a.length;j++)
			{	if(Character.isUpperCase(a[j]))
					count++;
			
			
			}
			
			
				System.out.println(count);
		}
		

	}

}
