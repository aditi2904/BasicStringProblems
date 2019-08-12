import java.util.HashMap;
import java.util.Scanner;

public class hashhh {
static HashMap <Integer, Integer> ht = new HashMap<Integer, Integer>();
	public static String insertHash(int val,int N){
		String io = "";
		int i = val,direction = -1;
		int j = i%N;
		io += j + " ";
		if(ht.get(j) == null){
			ht.put(j, val);
			return io;
		}
		while(true){
			if((i%10)%2 == 1)
				direction = 1;
			else
				direction = -1;
			j = (j+direction*((i/10)%N) + N)%N;
			io += j + " ";
			if(ht.get(j) == null){
				ht.put(j, val);
				return io;
			}
			if(i<10){
				while(true){
					j = (j+direction)%N;
					io += j + " ";
					if(ht.get(j) == null){
						ht.put(j, val);
						return io;
					}
				}
			}
			i = i/10;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();  
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n-1;j++)
		{
		System.out.println(insertHash(a[j],n));

	}

}
}
