import java.util.Scanner;

public class CountSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count;
for(int i=0;i<n;i++)
{ count=0;
	String s=sc.next();
	for(int j=0;j<s.length();j++)
	{
			if(s.charAt(j)=='1' )
				count++;
			
		}
	System.out.println(count*(count-1)/2);
	}
	
}
	}


