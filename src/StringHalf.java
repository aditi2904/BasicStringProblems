import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class StringHalf {

	public static void main (String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String str = br.readLine() ;
		    char[] str1 = str.substring(0,(str.length()/2)).toCharArray() , str2 = str.substring(str.length()-str.length()/2).toCharArray();
		    Arrays.sort(str1);
		    Arrays.sort(str2);
		   // System.out.println();
		    if(Arrays.toString(str1).equals(Arrays.toString(str2)))
		    System.out.println("YES");
		    else
		    System.out.println("NO"); 
		    
		}
	}

	}


