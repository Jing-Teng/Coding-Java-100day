import java.util.*;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
//		System.out.print("0");
		int i,j,k;
		
		for ( i =0 ;i<n ;i++) {
			for ( j =0 ;j<i ;j++) {
				if ( i > n/2) {
					break;
				}
				System.out.print("0");
			}			
			for ( j =n ;j>i*2 ;j--) {
				System.out.print("*");
			}		
			System.out.println();
		}
		for ( i =0 ;i<n-1 ;i++ ) {
			for ( k =i; k>0 ; k--) {
				System.out.print("0");
			}
			System.out.println();
			
			for ( j =0 ;j<i ;j++) {
//				if ( i > n/2) {
//					break;
//				}
				System.out.print("*");
			}			
		
		}
		
		
	}
}
