import java.util.Scanner;

public class ZeroesAtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
for(int i=0;i<n;i++)
{ int count=0;
int flag=0;
	int m=sc.nextInt();
	sc.nextLine();
	int a[]=new int [m];

    StringBuffer sb = new StringBuffer();
	for(int j=0;j<m;j++)
	{
		a[j]=sc.nextInt();
		if(a[j]!=0)
			a[count++]=a[j];
        
	}
	while(count<m)
		a[count++]=0;
	for(int l=0;l<m;l++)
		System.out.print(a[l]+" ");
}
	}

}
