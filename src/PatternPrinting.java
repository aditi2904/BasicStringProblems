
import java.util.*;
import java.lang.*;
import java.io.*;

class altposneg {
public static void main (String[] args) {
//code
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0){
int n=sc.nextInt();
ArrayList<Integer> a = new ArrayList<Integer>();
ArrayList<Integer> b = new ArrayList<Integer>();
for(int i=0;i<n;i++){ 
	int k=sc.nextInt();
	if(k%2==0)
a.add(k);
else
b.add(k);

}
for(int i=0;i<a.size();i++)
{ System.out.print(a.get(i)+" ");
	if(i<b.size())
		System.out.print(b.get(i)+" ");
		} 
		System.out.println("");
		t--;
		} 
		}
}