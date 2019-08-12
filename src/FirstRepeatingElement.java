/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class FirstRepeatingElement {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int m=sc.nextInt();
		    int a[]=new int[m];
		    for(int j=0;j<m;j++)
		    a[j]=sc.nextInt();
		    int index=0;
		    for(int k = 0; k <m; k++) {  
           int count = 1;  
            for(int l = k+1; l <m; l++) {  
                if(a[k] == a[l]) {  
                    count++; 
                    index=k;
                    //Set string[j] to 0 to avoid printing visited character  
                    break;
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
		    
		}
		  
                System.out.println(index+1);  
	}
}
}