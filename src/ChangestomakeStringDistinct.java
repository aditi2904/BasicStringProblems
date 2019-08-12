import java.util.Scanner;

public class ChangestomakeStringDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
	     {System.out.print("inside");
	         String s=sc.next();
	         String temp="";
	         for(int j=0;j<s.length();j++)
	         {
	             if(temp.indexOf(s.charAt(j))==-1)
	             temp+=s.charAt(j);
	         }
	         int len=temp.length();
	         int actlen=s.length();
	         int diff=actlen-len;
	     
	       
	     }
	}

}
