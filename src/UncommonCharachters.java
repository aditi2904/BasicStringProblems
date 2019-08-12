import java.util.*;
import java.lang.*;

		   import java.io.*;
class GFG
{	public static Scanner scanner ;
public static void main(String[] args) {
scanner = new Scanner(System.in);
int tc = scanner.nextInt();
while(tc>0){
printUncommonCharacters() ;
tc--;
}
}
private static void printUncommonCharacters() {
String s1 = scanner.next() ;
String s2 = scanner.next() ;
for(char c = 'a' ; c<= 'z' ; c++ ) {
if(s1.indexOf(c) >= 0 && s2.indexOf(c) < 0 || s1.indexOf(c) < 0 && s2.indexOf(c) >= 0)
System.out.print(c);
else 
continue ;
}
System.out.println();
}
}