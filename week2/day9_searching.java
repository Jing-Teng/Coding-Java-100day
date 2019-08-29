import java.util.Scanner;

public class day9_searching {
	//輸入一串數字 並輸出最大最小的位置
	//應該是要用searching做啦
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("輸入一串數字 -1結束");
		int x = 0; //real length
		
		int []arr; //input
		int COUNT = 10000000;
		arr = new int[COUNT];
		
		int w =  scanner.nextInt();
		while ( w != -1 ) {						
			arr[x] = w;
			x++;
			w =  scanner.nextInt();			
		}
//		for (int j=0; j<x; j++) {
//			System.out.println(arr[j]);
//		}		
		int sit[];  //座號
		sit = new int[x];			
		for (int j=0; j<x; j++) {
			sit[j] = j;
		}
	
		int[] a; //copy arr
		a = new int[x];
		for (int j=0; j<x; j++) {
			a[j] = arr[j];
		}
				
	  for (int i = 0; i < a.length; i++) {
			int temp;
			for (int j = 0; j < a.length - i -1; j++) {
			  if (a[j] > a[j + 1]) { //swap
			    	  
				  	
				  	  temp = a[j];
			    	  a[j]=a[j+1];
			    	  a[j+1]=temp;
			    	  
			    	  temp = sit[j];
			    	  sit[j]=sit[j+1];
			    	  sit[j+1]=temp;
			  }}}
		  
		  System.out.println("^_^ 最小數值: " + a[0] + " 位置:  " + (sit[0]+1));
		  
		  int max=x-1;
		  
		  while ( a[max] == a[max-1]) {
			  max--;
		  }
		  System.out.println("^_^ 最大數值: " + a[max] + " 位置:  " + (sit[max]+1) );
		  
	  
		
	}
}
