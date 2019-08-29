import java.util.Scanner;

public class day4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input =scanner.nextInt();
/*****我的	
		int remainder=1;
		int i=2;
		int half=input/2+1;
		
		switch(input) {
			case 1:
			System.out.println("not prime");
			break;
			
			case 2:
			System.out.println("is prime");
			break;
		}
		
		while ( i < half ) {

			remainder = input % i;
			
			if ( remainder == 0 ) {
				System.out.println("not prime");
				break;
			}else {
				++i;
			}
		}
		if (i==half)
			System.out.println("is prime");			
******/
		
/*****ANS
		boolean isPrime = true;
	
		switch(input) {
		case 1:
			isPrime = false;
		break;
		
		case 2:
			isPrime = true;
		break;
		}		
		
		
		for (int i=2; i<input; i++) {
			if(input%i == 0) {
				isPrime = false;
			}
		}
		System.out.println("is prime : " + isPrime);
		System.out.println( isPrime == true ? "是":"不是" + "質數");
		System.out.println( isPrime? "是":"不是" + "質數");
******/
		boolean a = true;
		if (a) {
			System.out.println("a");
		}
		if (!a) {
			System.out.println("!a");
		}
		
	}	
}
