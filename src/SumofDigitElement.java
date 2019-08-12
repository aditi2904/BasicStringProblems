
import java.util.*;
import java.lang.*;
import java.io.*;

class SumofDigitElement {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while (t-- > 0)
		{
		    String s=sc.nextLine();
		    //char ch[]=s.toCharArray();
		    String a[]=s.split("\\D");
		    int sum=0;
		    for (int i=0;i<a.length;i++)
		    {
		        
		        if(!a[i].isEmpty())
		        sum=sum + Integer.parseInt(a[i]);
		    }
		    System.out.println(sum);
		}
	}
}