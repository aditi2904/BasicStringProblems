import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveChar {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		String[] result=new String[test];
		for(int i=0;i<test;i++){
		    String s1=s.next();
		    String s2=s.next();
		    for(int j=0;j<s1.length();j++){
		        if(s2.indexOf(s1.charAt(j))!=-1){
		            s1=s1.substring(0,s1.indexOf(s1.charAt(j)))+s1.substring(s1.indexOf(s1.charAt(j))+1);
		            j--;
		        }
		    }
		    result[i]=s1;
		}
		for(int i=0;i<test;i++){
		    System.out.println(result[i]);
		}
	}
}