import java.util.*;

// 讓使用者輸入兩整數 n, m     找出n, m的最大公因數
// 讓使用者輸入 本金, 利率, 存入年份, 取回年份    計算最後拿回的金額(複利)
// 本金 * (1+利率)^年次
public class day4_hw {
	public static void main(String[] args) {
		//int[] a = {0}; 
		int mi=0;
		int ni=0;
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int mm[] = new int[num];
		int nn[] = new int[num];
		
		int m =scanner.nextInt();
		int n =scanner.nextInt();

//		int temp=0;
//		if (m>n) {
//			temp=m;
//			m=n;
//			n=temp;		
//		}
		
		int i;		
		int j=1;
		int k=1;	
		for (i=1; i<=m; i++) {
			if(m%i == 0) {
				mm[mi] = i;
				System.out.println(mm[mi++]);
			}
		}
		
		//System.out.println(mi);
		//System.out.println("=====");
		for (i=1; i<=n; i++) {
			if(n%i == 0) {
				nn[i] = i;
				ni++;
				//System.out.println(nn[i]);
			}
		}
		//System.out.println(ni);
		System.out.println("=====");

		System.out.println(mm[0]);
		System.out.println(mm[1]);
		System.out.println(mm[2]);
		
		
//		for (j=mi; j>0; j--) {
//			
//			System.out.println(j);
//			System.out.println(mm[j]);
//		}
//			for (k=ni; k>0; k--) {
//					System.out.println(k);
//					System.out.println(mm[j]);
//					System.out.println(nn[k]);
//					
//					if ( mm[j] / nn[k] == 1) {
//	
//						System.out.println(mm[j]);
//						System.out.println(nn[k]);
//						break;
//				}
//			}
//			
//		}
		
	}	
}
