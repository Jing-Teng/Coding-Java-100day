import java.util.Scanner;

//day8 選單輸入的解答
public class day9 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);		
		int opt;
		int [] scores = null;
		
//		int w =  scanner.nextInt();
//		score = new int[];
//		
//		
//		while ( w != -1 ) {						
//			a[i] = w;
//			i++;
//			w =  scanner.nextInt();
//			
//		}
		
		do {
			do {
				System.out.println("1輸入成績 2印出 3離開");
				opt =  scanner.nextInt();	
			}while ( opt<1 || opt>3 ); 
			
			switch(opt) { //選單
				case 1:
					//輸入學生個數
					System.out.println("輸入人數");
					int n =  scanner.nextInt();
					
					//輸入成績
					scores = new int[n];
					
					for(int i=0;i<n;i++) {
						int score;
						do {
							System.out.println("輸入成績");
							score = scanner.nextInt();
						}while( score<0 || score>100 );	
						scores[i]=score;
					}					
					break;
				case 2:
					for (int j=0; j<scores.length; j++) {
						//System.out.println(a[j]);
						System.out.println((j+1)+" 成績: "+ scores[j]);
					}
					break;
//				case 3:
//					//
			
			
			} //switch
		
		}while( opt!=3 );//do

	}
}

