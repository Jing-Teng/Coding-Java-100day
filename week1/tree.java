import java.util.Scanner;

public class tree {

	public static void main(String[] args) {
		System.out.print("�п�J3�H�W���_��");
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		
		int i,j,k;
		
		
		for ( i =0 ;i<n/2 ;i++) {
			for ( j =0 ;j<i ;j++) {
				System.out.print(" ");
			}			
			for ( j =n ;j>i*2 ;j--) {
				System.out.print("*");
			}		
			System.out.println();
		}
		
		
		
		for (i=0; i<n/2+1; i++)
		{		
		   for (j=0; j<n/2-i; j++)
	      {
	 		 System.out.print(" ");
	 		 
	      }
		   for (k=0; k<2*i+1; k++)
	      {
	 		 System.out.print("*"); 		
	      }
		   System.out.print("\n");
		}

	}

}
