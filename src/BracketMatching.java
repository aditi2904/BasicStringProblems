 import java.util.*;
import java.lang.*;

public class BracketMatching{
	public static boolean checkBrackets(String str){
		char[] chars=str.trim().toCharArray();
		int leftParenBrc=0;
		int rightParenBrc=0;
		int leftSquareBrc=0;
		int rightSquareBrc=0;
		int leftCurlyBrc=0;
		int rightCurlyBrc=0;
		for(char ch:chars){
			switch(ch){
				case '(' :leftParenBrc++;break;
				case ')' :rightParenBrc++;break;
				case '[' :leftSquareBrc++;break;
				case ']' :rightSquareBrc++;break;
				case '{' :leftCurlyBrc++;break;
				case '}' :rightCurlyBrc++;break;
				default:break;
			}
		}
		if(leftParenBrc==rightParenBrc  &&  leftSquareBrc==rightSquareBrc  &&  leftCurlyBrc==rightCurlyBrc)			
			return true;
		return false;
	}
	public static void main(String[] args){
		try{Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		scan.nextLine();
		String[] strInp=new String[size];
		for(int i=0;i<size;i++)					
			strInp[i]=scan.nextLine().trim();
		for(int i=0;i<size;i++){
			if(checkBrackets(strInp[i].trim()))					
				System.out.println("TRUE");
			else								
				System.out.println("FALSE");
		}					
		scan.close();}catch(Exception e){
			e.printStackTrace();
		}
	}

}