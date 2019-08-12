import java.util.*;
import java.lang.*;
import java.io.*;

class RockPaper {
	public static void main (String[] args) {
		//code
		Scanner sc =  new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String s = sc.nextLine();
		    if(s.charAt(1)=='R'&&s.charAt(0)=='S'||s.charAt(1)=='S'&&s.charAt(0)=='P'||s.charAt(1)=='P'&&s.charAt(0)=='R'){
		        System.out.println("B");
		    }
		    else if(s.charAt(1)=='S'&&s.charAt(0)=='R'||s.charAt(1)=='P'&&s.charAt(0)=='S'||s.charAt(1)=='R'&&s.charAt(0)=='P'){
		        System.out.println("A");
		    }
		    else{
		        System.out.println("DRAW");
		    }
		    
		}
	}
}