import java.util.Scanner;

//���_��J�{������-1 ��X�̤j�̤p
//�ӤW ��X�ϥΪ̿�J��n����m �䤣�����-1 
//�ƦC��L�X
//���}

public class day10_hw2 {

	public static void main(String[] args) {
		int []a;
		
		a = new int[2]; 
		int input = 0,count=0; 
//		int i = -1;
//		int opt;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("��J�����");
			
		
		do {
		input = scanner.nextInt();
		
		if (input != -1) {  //�s�J�e���P�_
			if (count >= a.length) {   //Resize array
			int newArray[] = new int[a.length * 2]; 
			for (int i = 0; i < a.length; i++) { 	
			newArray[i] = a[i];
			}
			a = newArray;
		} 		
		if (count < a.length)
		a[count++] = input;
		} 
		} while (input != -1);
		
		
		
		
		for (int i=0; i<count; i++) {
		System.out.printf("%d\n", a[i]);
		}
		
		int min=a[0];
		int minIndex=0;
		for (int i=0; i<count; i++) {
			if(min>a[i]) {
				min=a[i];	
				minIndex=i;
			}
		}
			
		System.out.printf("�̤p�O  %d ��m�b %d \n", min,minIndex);
		
		System.out.println("��J�d�߭�");
		int find = scanner.nextInt();
		int [] fIndex = new int[count];
		
		for (int i=0; i<count; i++) {
			fIndex[i] = -1;
		}
		for (int i=0; i<count; i++) {
			if(find == a[i]) {
				fIndex[i]=i;
			}
		}
		
		int qq=0;
		for (int i=0; i<count; i++) {
			qq += fIndex[i];
			if(fIndex[i] != -1 ) {
				System.out.printf("��m�b %d \n", fIndex[i]);
			}
			if( qq == (-1)*count ) {
				System.out.print("�䤣��");
			}
		}


		
		
		
	}

}
