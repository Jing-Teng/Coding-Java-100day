import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a ;

		int c ;

		long sum = 1;

		for (int i =1; i<=16 ; i++) {
			sum *= 2;
			System.out.printf("%d => %d",i ,sum);
			System.out.println();
		}
		
		while( (a = scanner.nextInt() ) != -1 ) {

			c =scanner.nextInt();
			
			System.out.println(a-c);

			System.out.println("===============");
		}	

	
	}

}
