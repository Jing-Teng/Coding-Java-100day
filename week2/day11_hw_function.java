// �м��g�@�ӵ{�� �̷ӥH�U�y�{�i��
//         ���ϥΪ̤��_��J�Ʀr �����J-1
//         ���ϥΪ̿�ܥH�U�ﶵ:
//           1. �ƧǥH�W�Ʀr
//           2. �L�X�H�W�Ʀr
//           3. �H�����åH�W�Ʀr
import java.util.Scanner;
public class day11_hw_function {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opt;
		int n = 0;
		int []arr = new int[2];
		int count =0;
		do {
		do {
			System.out.println("1��J 2�ƦL 3���æL");
			opt = scanner.nextInt();
		}while(opt>3 || opt<0);
		
		switch(opt){	
		case 1:
		//��J����
			System.out.println("��J�Ʀr");
			n = scanner.nextInt();		
	//		myArray(arr,n,count);
			while( n!=-1 ){
			
			//�O���鱱��
			if (count == arr.length) {
	            int[] tmpArr = new int[arr.length * 2];
	            for (int i = 0; i < arr.length; i++) {
	                tmpArr[i] = arr[i];
	            }
	            arr = tmpArr;
	        }
			
			arr[count]=n;//��J	
			count++;
			n = scanner.nextInt();
			}
		break;	
		case 2:	
			bbsorting(arr,count);
			print(arr,count);
			System.out.println();
		break;
		case 3:
			chose(arr,count);
			print(arr,count);
			System.out.println();
		break;
		}
		}while(opt!=3);
		

	}
//	public static int myArray(int arr[], int n, int count) {
//		Scanner scanner = new Scanner(System.in);
//		while( n!=-1 ){
//			
//		//�O���鱱��
//		if (count == arr.length) {
//            int[] tmpArr = new int[arr.length * 2];
//            for (int i = 0; i < arr.length; i++) {
//                tmpArr[i] = arr[i];
//            }
//            arr = tmpArr;
//        }
//		
//		arr[count]=n;//��J	
//		count++;
//		n = scanner.nextInt();
//		}
//		
//		return arr;
//	}
	
	
	
	public static void bbsorting(int arr[], int count) {
		int temp;
		for(int i=0; i<count; i++) {
			for(int j=0; j<count-i-1; j++) {
				//swap ���g�F ���ө�X�� swap( arr, j,j+1 )
				if(arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void chose(int arr[], int count) {
		int temp;
		
		for(int i=0; i<count; i++) {
			int r = (int) (Math.random()* (count-i) +i);
			//swap ���g�F ���ө�X��  swap( arr, i,r)
			temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
			
		}
		
	}
		
	public static void print(int arr[], int count) {
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
		}
	}	
		


	
	

}
