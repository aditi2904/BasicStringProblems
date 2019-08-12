import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner s = new Scanner(System.in);
	 
	 int t=s.nextInt();
	 while(t>0){
	     int n=s.nextInt();
	    int[] a = new int[n];
	     
	     for(int i=0;i<n;i++){
	        a[i]=s.nextInt();
	     }
	     Arrays.sort(a);
	     int sum=a[0];
	     for(int i=0;i<n-1;i++){
	         if(a[i]!=a[i+1])
	         sum=sum+a[i+1];
	     }
	     System.out.println(sum);
	     t--;
	 }
	 }
}