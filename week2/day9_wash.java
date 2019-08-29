//print 結果不對

import java.util.Scanner;

public class day9_wash {

	public static void main(String[] args) {
		
		int[][] a= new int[52][2]; //牌的編碼 順序
		
			for(int j=0; j<52; j++) {
				a[j][0] = j+1;
				a[j][1] = (int)(Math.random()*51+1);
			}
		
//			for(int j=0; j<52; j++) {
//				System.out.println(a[j][1]);
//			}

			
			  for (int i = 0; i < a.length; i++) {  //排序
				  	int temp;
				  	
				  	for (int j = 0; j < a.length - i -1; j++) {
				      if (a[j][1] > a[j + 1][1]) {	
				    	  
					    	  temp = a[j][1]; //swap 亂數序號
					    	  a[j][1]=a[j+1][1];
					    	  a[j+1][1]=temp;	
					    	  
					    	  temp = a[j][0]; //swap 排的編碼
					    	  a[j][0]=a[j+1][0];
					    	  a[j+1][0]=temp;
				    	  
				      }
				  }
			  }
		
		
			  int z,w;
				for(int j=0; j<52; j++) {
					w = a[j][0]/13;
					z = a[j][0]%13+1;
					if (j%14==13)
						System.out.println();
					switch(w) {
					case 0:						
						System.out.print("黑桃");
						System.out.println(z);
						break;
					case 1:
						
						System.out.print("紅心");
						System.out.println(z);
						break;
					case 2:
						
						System.out.print("方塊");
						System.out.println(z);
						break;
					case 3:
						
						System.out.print("梅花");
						System.out.println(z);
						break;
					
					
					
					}
					
					
					
				}
				
				
				
				
				
	}

}
