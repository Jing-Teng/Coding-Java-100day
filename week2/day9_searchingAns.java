import java.util.Scanner;

public class day9_searchingAns {
	//day9_searching���ѵ�
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("�X�ӼƦr");		
		int n = scanner.nextInt();
		int arr[] =  new int [n];

//		
//		//��J
//		
//		int opt; //���
//		
//		do {
//			//���
//			switch(opt) {
//			case 1:
//				//�洫 ���Z+�y��
//				
//			}
//		}while();	
			
			
		//��j�p
		for(int i=0;i<arr.length;i++) {
			do {
				System.out.println("�п�J�����");	
				arr[i] = scanner.nextInt();
			}while(arr[i]<0);		
		}
		
//		int min= -1;
//		int mindex = -1;
//		for (int i=0;i<arr.length;i++){
//			if(min > arr[i] || min==-1) {
//			min = arr[i];
//			mindex=i;
//			}
//		}
//		
//		int max= -1;
//		int Mindex = -1;
//		for (int i=0;i<arr.length;i++){
//			if(max < arr[i]) {
//			max = arr[i];
//			Mindex=i;
//			}
//		}

		int min= -1;
		int mindex = -1;
		for (int i=0;i<arr.length;i++){
			if(min > arr[i] || min==-1) {
			min = arr[i];
			mindex=i;
			}
		}
		
		int max= arr[0];
		int Mindex = 0;
		for (int i=0;i<arr.length;i++){
			if(max < arr[i]) {
			max = arr[i];
			Mindex=i;
			}
		}
		
		System.out.println("�̤p��m:  "+mindex + "��:  " + min);
		System.out.println("�̤j��m:  "+Mindex + "��:  " + max);
	}
}
