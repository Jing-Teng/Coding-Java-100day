import java.util.Scanner;

//day8 ����J���ѵ�
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
				System.out.println("1��J���Z 2�L�X 3���}");
				opt =  scanner.nextInt();	
			}while ( opt<1 || opt>3 ); 
			
			switch(opt) { //���
				case 1:
					//��J�ǥͭӼ�
					System.out.println("��J�H��");
					int n =  scanner.nextInt();
					
					//��J���Z
					scores = new int[n];
					
					for(int i=0;i<n;i++) {
						int score;
						do {
							System.out.println("��J���Z");
							score = scanner.nextInt();
						}while( score<0 || score>100 );	
						scores[i]=score;
					}					
					break;
				case 2:
					for (int j=0; j<scores.length; j++) {
						//System.out.println(a[j]);
						System.out.println((j+1)+" ���Z: "+ scores[j]);
					}
					break;
//				case 3:
//					//
			
			
			} //switch
		
		}while( opt!=3 );//do

	}
}

