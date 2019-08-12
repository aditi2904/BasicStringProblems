import java.util.*;
import java.lang.*;
import java.io.*;

class MaxElement {
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
		    int n=a.length;
		    int arr1[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        if(!a[i].isEmpty())
		        {
		            arr1[i]=(Integer.parseInt(a[i]));
		        }
		    }
		    Arrays.sort(arr1);
		    System.out.println(arr1[n-1]);
		}
	}
}