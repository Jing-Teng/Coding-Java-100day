package week2;

//這個是最新版 ^_^

//swap 整副牌
//應該要練習包 function
//print 結果還是不對 少一張牌 一直都會有一張黑桃A印不到
public class day9_hw2_wash2 {

	public static void main(String[] args) {
		
		int[][] a= new int[52][2]; //牌的編碼 順序
		
			for(int j=0; j<52; j++) {
				a[j][0] = j+1;
				a[j][1] = (int)(Math.random()*52+1);  //如果要建立1~52的亂數就要*52+1
			
			}
//			System.out.println();
//			for(int j=0; j<52; j++) {
//				System.out.print(a[j][0]+" ");
//				System.out.println(a[j][1]);
//			}
//			System.out.println();
			
			
			  for (int i = 0; i < a.length; i++) {  //排序
				  	int[] temp = new int[2];	
				  	for (int j = 0; j < a.length - i -1; j++) {
//				      if (a[j][1] > a[j + 1][1]) {	
//				    	  temp = a[j][0]; //swap 牌
//				    	  a[j][0]=a[j+1][0];
//				    	  a[j+1][0]=temp;
//				    	  
//				    	  temp = a[j][1]; //swap 序號
//				    	  a[j][1]=a[j+1][1];
//				    	  a[j+1][1]=temp;	

//					      if (a[j][1] > a[j + 1][1]) {	
//					    	  temp[j] = a[j][0]; //swap 整副牌
//					    	  a[j][0]=a[j+1][0];
//					    	  a[j+1][0]=temp[j];

					      if (a[j][1] > a[j + 1][1]) {	
					    	  temp = a[j]; //swap 整副牌
					    	  a[j]=a[j+1];
					    	  a[j+1]=temp;

				      }
				  }
			  }
		
			  int fuck1=0;
			  int fuck2=0;
			  int fuck3=0;
			  int fuck4=0;
			  int z,w;
				for(int j=0; j<a.length; j++) {

					System.out.print((j+1) +" ");
//					if (j%14==13)
//						System.out.println();
					
					w = (a[j][0]-1)/13;
					z = (a[j][1])%13 +1 ; //哇~~~~~~~~~~~ debug de不完
					
					//System.out.println(z);
					
					
					switch(w) {
					case 0:						
						System.out.print("黑桃");
						System.out.println(z);
						fuck1++;
						break;
					case 1:
						
						System.out.print("紅心");
						System.out.println(z);
						fuck2++;
						break;
					case 2:
						
						System.out.print("方塊");
						System.out.println(z);
						fuck3++;
						break;
					case 3:
						
						System.out.print("梅花");
						System.out.println(z);
						fuck4++;
						break;	
					}
					

				}
				
				
				System.out.println(fuck1);
				System.out.println(fuck2);
				System.out.println(fuck3);
				System.out.println(fuck4);
				
				
	}

}
