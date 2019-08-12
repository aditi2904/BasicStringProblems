import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s = new Scanner(System.in);
	 int t = s.nextInt();
	 while(t-->0)
	 {
	     String str1 = s.next();
	     String str2  = s.next();
	     
	     char[] ch1 = str1.toCharArray();
	     char[] ch2 = str2.toCharArray();
	     
	     StringBuffer sb = new StringBuffer();
	     for(int i=0;i<ch1.length;i++)
	     {
	         int flag = 0;
	         for(int j=0;j<ch2.length;j++)
	         {
	             if(ch1[i] == ch2[j])
	             {
	                 flag = 1;
	                 break;
	                
	             }
	         }
	         if(flag == 0)
	         {
	             sb.append(ch1[i]);
	         }
	     }
	     for(int i=0;i<ch2.length;i++)
	     {
	         int flag = 0;
	         for(int j=0;j<ch1.length;j++)
	         {
	             if(ch2[i] == ch1[j])
	             {
	                 flag = 1;
	                 break;
	             }
	         }
	         if(flag == 0)
	         {
	             sb.append(ch2[i]);
	         }
	     }
	     if(sb.length() == 0)
	     {
	         System.out.println(-1);
	     }
	     else
	     {
	     System.out.println(sb);
	     }
	 }
	 }
}