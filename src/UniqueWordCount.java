import java.util.HashSet;
import java.util.Scanner;

public class UniqueWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] words = s.toLowerCase().split("\\s+");
 HashSet<String> set = new HashSet<String>();
		
		for(int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		//set.remove("");
		
		System.out.println(set.size());
		for(String s1:set)
			System.out.println(s1);
			
	}

}


