import java.util.Scanner;

public class day9_hw1_gradeSorting {
	//hw2 多維陣列排序問題
	//怎麼隔天一開就爆炸= =
	//然後//檢查又沒錯????
	//n<5會出錯 改好了 中間的print有寫錯  直接砍掉重寫
	//應該都沒問題了
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n =  scanner.nextInt(); //人數
		
		
		int [][]a = new int [n][5];// 0國文 1英文 2總分 3座號 4名次
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = (int)(Math.random()*61+40);//最低40 最高100
			}
			a[i][2] = a[i][0]+a[i][1];//總分
			a[i][3] = i+1;//座號
			a[i][4] = 0;//暫時名次
		}
		
		//印印看
		System.out.println("國 英 總 座號 名次");
		for (int i=0; i<a.length; i++) {		
			for(int j=0; j<5; j++) {
				
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
			
			  int [] temp = new int[5];
			  for (int i = 0; i < 5 ; i++) {  //排序	  	
			
			  for (int j = 0; j < a.length - i -1; j++) {
			  if (a[j][2] < a[j + 1][2]) {	
				  
				  temp = a[j]; //swap 陣列
				    	  a[j] = a[j+1];
				    	  a[j+1] = temp;	
			    	  
				      }
				  }
			  }


			
				System.out.println("國 英 總 座號 名次");
				for (int i=0; i<a.length; i++) {
					a[i][4] = i+1; //名次
					for(int j=0; j<5; j++) {
						
						System.out.print(a[i][j]);
						System.out.print(" ");
					}
					System.out.println();
				}
		  
		  
		  
	}
}
