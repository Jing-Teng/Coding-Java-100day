import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int qw = scanner.nextInt();
		
		int square = scanner.nextInt();
		
		int i, j, k;
		
		switch(square)
		{
		case 1:
			//方形
			for (i=0; i<qw; i++)
			{
				   for (j=0; j<qw; j++)
			      {
			           System.out.print("*");
			      }
				   System.out.print("\n");
			}
			System.out.print("\n");
			break;
		
		case 2:
			for ( i=0; i<qw; i++)
			{
				if (i==0)
			    {
				    for (k=0; k<qw; k++)
				          System.out.print("*");
			    }
			    else if (i >= 1 && i <= qw-2)
			    {
				    System.out.print("*");
				    for ( j=0; j<qw-2; j++)
				    {
				           System.out.print(" ");
				    }
			 	    System.out.print("*");
			    }
			    else if (i == qw-1)
			    {
			 	    for (i=0; i<qw; i++)
				          System.out.print("*");
			    }
				System.out.print("\n");
			}
			break;
		
		case 3:
			for (i=0; i<qw; i++)
			{
				   for (j=0; j<qw-i; j++)
			      {
			 		 System.out.print("*");
			      }
				   System.out.print("\n");
			}
		break;
		
		case 4:
			// 直角三角 左上
			for (i=0; i<qw; i++)
			{
				   for (j=0; j<qw-i-1; j++)
			      {			 		
			 		System.out.print(" ");
			      }
				   for (k=0; k<qw-j; k++)
				      {
				 		 System.out.print("*");
				      }
				   System.out.print("\n");
			}
			
			// 直角三角 左下
			for (i=0; i<qw; i++)
			{
				   for (j=qw; j>qw-i; j--)
			      {
			 		System.out.print(" ");
			      }
				   for (k=qw-i; k>0; k--)
				      {
				 		 System.out.print("*");
				      }
				   System.out.print("\n");
				   
			}

		break;
		
		
		case 5:
			// 直角三角 右上
			for (i=0; i<qw; i++)
			{
				   for (j=qw; j>qw-i-1; j--)
			      {
			 		
			 		System.out.print("*");
			      }   
				   System.out.print("\n");
			}
			// 直角三角 右下
			for (i=0; i<qw; i++)
			{
				   for (j=0; j<qw-i; j++)
			      {
			 		 System.out.print("*");
			      }
				   System.out.print("\n");
			}
			break;
			

		
		case 6:
			// 等腰三角 
//			001 
//			0111
//			11111
//			0111
//			001
			
			for (i=0; i<qw; i++)
			{		
			   for (j=0; j<qw-i-1; j++)
		      {
		 		 System.out.print("0");
		 		 
		      }
			   for (k=0; k<2*i+1; k++)
		      {
		 		 System.out.print("1"); 		
		      }
			   System.out.print("\n");
			}
			for (i=0; i<qw; i++)
			{		
			   for (j=0; j<i+1; j++)
		      {
		 		 System.out.print("0");
		 		 
		      }
			   for (k=0; k<2*(qw-(i+1))-1; k++)
		      {
		 		 System.out.print("1"); 		
		      }
			   System.out.print("\n");
			}
			break;
		
		
		case 7:
			//abs 
			//數列規則 2,1,0,1,2 什麼東西會變小又變大 
			for (i=0 ; i<qw ; i++) {
				for (j =0; j< Math.abs(qw/2-i);j++) {
					System.out.print(" ");	
				}
				for (j =0; j< qw-Math.abs(qw/2-i)*2;j++) {
					System.out.print("*");	
				}
				System.out.print("\n");	
			}
			break;
		
		case 8:
		    for (i = 1; i <= qw; i++) {
		        for ( j = qw; j > i; j--) {
		          System.out.print(" ");
		        }
		        for (k = 1; k < i * 2; k++) {
		          System.out.print("*");
		        }
		        System.out.println();
		      }
		      for (i = qw-1; i > 0; i--) {
		        for ( j = qw; j > i; j--) {
		          System.out.print(" ");
		        }
		        for ( k = 1; k < i * 2; k++) {
		          System.out.print("*");
		        }
		        System.out.println();
		      }
		      break;

		case 9:
			//空心三角形
			
//			   *
//			   **
//			   * *
//			   *  *
//			   *****
			//第一行和最後一行的判斷不一樣
			//中間: 不管怎樣先印兩個* 

			break;
			
		case 10:
			//空心菱形 1
			//在實心菱形裡做 if-else 判斷
			for (i=0 ; i<qw ; i++) {					
				for (j =0; j< Math.abs(qw/2-i);j++) {
					System.out.print(" ");	
				}
				if ( i!=0 && i!=qw-1) {
					System.out.print("*");
				}			
				for (j =0; j< qw-Math.abs(qw/2-i)*2-1;j++) {
						System.out.print("-");	
				}
				System.out.println("#");
			}
					
			
			break;
		case 11:
			//空心菱形 2
			//刻出左邊再刻右邊小菱形
//			--*
//			-*-#
//			*---#
//			-*-#
//			--*
			//小菱形的頭尾不畫#
			for (i=0 ; i<qw ; i++) {
				for (j =0; j< Math.abs(qw/2-i);j++) {
					System.out.print(" ");	
				}
				System.out.print("*");
				for (j =0; j< qw-Math.abs(qw/2-i)*2-2;j++) {
					System.out.print(" ");	
				}
				if ( i!=0 && i!=qw-1) {
					System.out.print("#");
				}
				System.out.print("\n");	
			}
			break;
		
		
		case 12:
			//幹 原來他的菱形根本不是邊長 是底高 難怪我看不懂 這個有問題
			for (i=0; i<qw/2+1; i++) 
			{		
			   for (j=0; j<qw/2-i; j++)
		      {
		 		 System.out.print(" ");
		 		 
		      }
			   for (k=0; k<2*i+1; k++)
		      {
		 		 System.out.print("1"); 		
		      }
			   System.out.print("\n");
			}
		
			for (i=0; i<qw/2+1; i++) 
			{		
			   for (j=0; j<i+1; j++) //空白不用改
		      {
		 		 System.out.print(" ");
		 		 
		      }
			   for (k=0; k<qw-2*i-2; k++)  //3 -2*i => (n/2)- 2*1 +2)
		      {
		 		 System.out.print("1"); 		
		      }
			   System.out.print("\n");
			}
			break;
			
			//發現並不是這個公式
			
			//菱形高=5 ; 邊長=3
			//7 ; 4
			//9 ; 5
			
			// 7/2 - 0 + 2 =5
			// 7/2 - 2 + 2 =3
			
		}	
	}
}
