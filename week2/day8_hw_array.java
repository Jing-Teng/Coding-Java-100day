import java.util.*;
//��J  �����J-1����

class Rectangle {
	int width=10;
	public void what(){
		System.out.println("[]");
	}
}


public class day8_array {

	public static void main(String[] args) {
		

		Scanner scanner= new Scanner(System.in);
		//�@�~1 �ǥͦ��Z
//		int ARR;		
//		int v = 0;
//		while ( v==0 ) {
//			System.out.println("�п�J�ǥͤH��"); //�@�~2 �令�ʺA��J  �����J-1
//			ARR = scanner.nextInt();		
//			int[] a,b,c;
//			
//			a = new int[ARR];
//			System.out.println("�п�J�ǥͦ��Z");
//			for (int i=0; i<a.length; i++) {
//				//System.out.println(a[i]);
//				do {
//					a[i] = scanner.nextInt();
//					
//				}while(a[i]<0 || a[i]>100);
//			}		
//
//		System.out.println("���s��J�Ы�0,���}�{���Ы�1, �C�L�Ы�2");
//		v = scanner.nextInt();
//
//		if ( v==2) {
//			for (int i=0; i<a.length; i++) {
//				System.out.println(a[i]);
//			}
//		}
		int i = 0;
		int []a;
		int count = 100;
		a = new int[count];
		
		int w =  scanner.nextInt();
		while ( w != -1 ) {						
			a[i] = w;
			i++;
			w =  scanner.nextInt();
			
		}
		
		for (int j=0; j<i; j++) {
		System.out.println(a[j]);
		}
		
		
		
		
		
		
		
		//�ocode �n��e�X�Ϩ�
//		int a;
//		

//		Scanner[] scanners = new Scanner[5];
//		scanners[0] = new Scanner(System.in);
//		a = scanners[0].nextInt();
		
		

//		Rectangle[] rectangles = new Rectangle[5];
//		
//		
//		Rectangle a = new Rectangle();
//		rectangles[0] = a;
//		a.what();
//		System.out.printf("%d\n", a.width );
//		System.out.printf("%d", rectangles[0].width );
		
		
	}


}


