import java.util.*;

public class test1 {

	public static void main(String[] args) {
		
		int temp=1;

		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt();
		
		int y = scanner.nextInt();	
		
		while( x != 0 ) {


			temp = y%x; 
			y = x;
			x =temp;

		}

			System.out.printf("%d",y);



	}
}

