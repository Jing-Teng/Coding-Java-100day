import java.util.Scanner;

public class day9_hw0_gradeSorting {
	//sorting 座號&成績
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		
		int ARR;		
		int v = 0;
		while ( v!=3 ) {
			System.out.println("請輸入學生人數"); //作業2 改成動態輸入  直到輸入-1
			ARR = scanner.nextInt();		
			int[] a,b,c;
			
			a = new int[ARR];
			System.out.println("請輸入學生成績");
			for (int i=0; i<a.length; i++) {
				//System.out.println(a[i]);
				do {
					a[i] = scanner.nextInt();
					
				}while(a[i]<0 || a[i]>100);
			}		

		System.out.println("重新輸入請按0, 列印請按1 ,整理後列印請按2, 離開程式請按3 ");
		v = scanner.nextInt();

		switch (v){
		case 1:
			for (int i=0; i<a.length; i++) {
				System.out.println("座號: "+i+" 分數: "+a[i]);
			}
		break;
		
		case 2:
			int sit[];
			sit = new int[a.length];			
			for (int j=0; j<a.length; j++) {
				sit[j] = j;
			}
			
			  //int[] array2=a.clone();
			  for (int i = 0; i < a.length; i++) {
				  	int temp;
				    for (int j = 0; j < a.length - i -1; j++) {
				      if (a[j] > a[j + 1]) {
//				        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
				      //swap
				      
				    	  temp = a[j];
				    	  a[j]=a[j+1];
				    	  a[j+1]=temp;
				    	  
				    	  temp = sit[j];
				    	  sit[j]=sit[j+1];
				    	  sit[j+1]=temp;
				    	  
			      }
				}
				for (int j=0; j<a.length; j++) {
					System.out.println(" 座號  " + sit[j]+1 +" 成績 " + a[j]);

				}
				break;
			  
			  }
			  
			  
		
		}
		
		}	
	}
}
