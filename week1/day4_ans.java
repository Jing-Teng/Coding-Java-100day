import java.util.Scanner;


public class day4_ans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		//�ƧQ
		
		double amount = scanner.nextDouble();
		double rate = scanner.nextDouble();
		int startY = scanner.nextInt();
		int endY = scanner.nextInt();
		int d = endY - startY;
		for (int i= 0; i<d ; i++) {
				amount *= 1+rate;
		}
		System.out.println(amount);
		
		
		//�̤j���]��
		int count = 0;
		int m = scanner.nextInt(); // �j
		int n = scanner.nextInt(); // �p
		int temp;


		//����۰�1
		while( m != 0 ) {
			if ( n>m ) {
				temp = m;
				m = n;
				n = temp;
			}
			m= m % n ; //�û� m(mod)n
			System.out.println(m); //m==0 ����
			System.out.println(n); //gcd min==1
			count++;
			
		}
		//����۰�2
//		while( n != 0 ) {
//			
//				temp = m%n; 
//				m = n;
//				n =temp;
//			
//		}

		System.out.printf("%d  %d",m,n);		
		
	}
}
