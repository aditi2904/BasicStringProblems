
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.Scanner;

	public class horizontalVerticalIntersection {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int v = sc.nextInt();
			int h = sc.nextInt();
			
			int count=0;
			int vc[][]=new int[100][3];
			int hc[][]=new int[100][3];
			
			
			for(int i = 0; i < v; i++) {
				for(int j=0;j<3;j++)
				vc[i][j]=sc.nextInt();
				}
				
			
			
			for(int i = 0; i < h; i++) {
				
				for(int j = 0; j < 3; j++) {
					hc[i][j] = sc.nextInt();
					//System.out.print(hc[i][j]);
				}
			
			for(int k = 0; k < v; k++) {
				
				for(int l = 0; l < h; l++) {
					
					if((vc[l][0] >= hc[k][1] && vc[l][0] <= hc[k][2]) && (hc[l][0] >= vc[k][1] && hc[l][0] <= vc[k][2])) {
						count++;
					}
				}
			}
			
			
			
		}
			System.out.println(count);
	}

	}
