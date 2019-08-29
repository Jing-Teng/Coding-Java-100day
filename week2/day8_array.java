import java.util.*;
//輸入  直到輸入-1停止

class Rectangle {
	int width=10;
	public void what(){
		System.out.println("[]");
	}
}


public class day8_array {

	public static void main(String[] args) {
		

		Scanner scanner= new Scanner(System.in);
		//作業1 學生成績
//		int ARR;		
//		int v = 0;
//		while ( v==0 ) {
//			System.out.println("請輸入學生人數"); //作業2 改成動態輸入  直到輸入-1
//			ARR = scanner.nextInt();		
//			int[] a,b,c;
//			
//			a = new int[ARR];
//			System.out.println("請輸入學生成績");
//			for (int i=0; i<a.length; i++) {
//				//System.out.println(a[i]);
//				do {
//					a[i] = scanner.nextInt();
//					
//				}while(a[i]<0 || a[i]>100);
//			}		
//
//		System.out.println("重新輸入請按0,離開程式請按1, 列印請按2");
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
		
		
		
		
		
		
		
		//廢code 要能畫出圖來
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


