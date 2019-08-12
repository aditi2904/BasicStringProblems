import java.util.Arrays;
import java.util.Scanner;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
int res[]=new int [n];
boolean inserted=false;
Arrays.fill(res, -2);
int k=0;
for(int j=0;j<n;j++) {
System.out.println("printing no"+a[j]);
	while(a[j]!=-1)
		
	{	 k=a[j]%n;
		if(res[k]==-2)
	{	
	inserted=true;
	k=j;
	System.out.println("true walla"+j);
		res[j]=k;
		System.out.println("true walla"+k);
		j++;
	}
	else
		if(inserted==false)
		{ System.out.println("inside if"+a[j]);
			int newk = 0;
			int k1=a[j]%n;
			System.out.print(k1);
			while(a[j]>0)
			{int rem=a[j]%10;
			a[j]=a[j]/10;
			if(rem%2==0)
			newk=a[j]%n;
			System.out.print(a[j]);
		j++;
		}
		
}
}
	}

}
}