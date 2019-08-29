import java.util.Scanner;
//可輸入 國文/英文 不可為空值
//可以選擇依照:
//總分排名 總分相同名次相同
//座號排序 不顯示名次
//離開


public class day10_hw1 {

	public static void main(String[] args) {
		int [][]a;
		
		a = new int[2][5]; //國文 英文 總分 座號 名次
		int n = 0;
		int i = -1;
		int opt;
		Scanner scanner= new Scanner(System.in);

			do {
				do {
					System.out.println("1重新輸入成績 2按照座號印出 3按照名次印出 4離開");
					opt =  scanner.nextInt();	
				}while ( opt<1 || opt>4 ); 
				
				switch(opt) { //選單
					case 1:
						//不斷輸入學生成績
						do  {
							System.out.println("i = " + i);
							if ( i < a.length) { 	
								i++;
						    }
							if ( i == a.length) {
					        	int [][]newArray = new int[a.length * 2][5]; 
					        	 
								for (int j = 0; j < a.length; j++) { 	
									newArray[j] = a[j];
									
								}
								a = newArray;
					        	 
							}
		
							System.out.println(a.length);
							System.out.println();
						    do {
								System.out.println("輸入國文");
								a[i][0] = scanner.nextInt();
						    }while( a[i][0]<-2 || a[i][0]>100 );
							if ( a[i][0] == -1 ) {break;}
							
							do {
								System.out.println("輸入英文");
								a[i][1] = scanner.nextInt();
								n++;
							}while(a[i][1]<=0 || a[i][1]>100);
							

						} while( a[i][0]>=0 || a[i][0]<100 );
						
						
						break;
					case 2:
						for (int j=0; j<n; j++) {
							System.out.println("座號: " + (j+1)+" 成績: "+ (a[j][0]+a[j][1]) );
						}
						break;
					
					case 3:
						System.out.println(n);
						
						int []temp = new int[5];
						for (int j=0; j<n; j++) {
							a[j][3] = j+1; //座號
							a[j][2] = a[j][0]+a[j][1];
						}
						for (int j=0; j<n; j++) { //沒有正確sorting 最後一次沒換到 但是n是length應該沒錯
							for (int k=0; k<n-j-1; k++) { 
								if ( a[k][2] < a[k+1][2]) { //這裡寫錯了 這邊以下剛剛還寫j 傻眼
									temp = a[k];
									a[k] = a[k+1];
									a[k+1] = temp;
								} 		
							}	
						}
						int rank = 1; //名次
						a[0][4] = 1;
						for (int j=0; j<n; j++) {
							if( a[j][2] > a[j+1][2] ) {
								
								a[j+1][4] = ++rank;
								
							}
							else {
								a[j+1][4] = a[j][4];
								++rank;
							}
							
							
						}
						for (int j=0; j<n; j++) {
							System.out.println("座號: " + (a[j][3])+" 成績: "+ (a[j][0]+a[j][1]) +" 名次: "+ a[j][4]);
						}
						break;

					}
			}while( opt!=4 );//do
		 
		
	}

}
