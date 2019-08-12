import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	{
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            String s= sc.next();
            System.out.println(evaluate(s));
        }
	}
	public static int evaluate(String str)
	{
	    StringBuilder sb= new StringBuilder(str);
	    int i=0;
	    int n=str.length();
	    int res=str.charAt(i)-'0';
	    while(i<n-2)
	    {
	        if(str.charAt(i+1)=='A')
	            res=res & (str.charAt(i+2)-'0');
	        if(str.charAt(i+1)=='B')
	            res=res | (str.charAt(i+2)-'0');
	        if(str.charAt(i+1)=='C')
	            res=res ^ (str.charAt(i+2)-'0');
	        i=i+2;
	    }
	    return res;
	    
	}
}