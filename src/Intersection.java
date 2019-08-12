import java.util.HashSet;
import java.util.Scanner;

public class Intersection {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,m;
			n=sc.nextInt();m=sc.nextInt();
			HashSet<Integer> A=new HashSet<>();
			HashSet<Integer> B=new HashSet<>();
			for(int i=0;i<n;i++)
			{
				A.add(sc.nextInt());
			}
			for(int i=0;i<m;i++)
			{
				B.add(sc.nextInt());
			}
			HashSet<Integer> intersection =new HashSet<Integer>(A);
			intersection.retainAll(B);
			System.out.println(intersection.size());
		}
}
}
