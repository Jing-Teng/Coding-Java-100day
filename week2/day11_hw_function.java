// 請撰寫一個程式 依照以下流程進行
//         讓使用者不斷輸入數字 直到輸入-1
//         讓使用者選擇以下選項:
//           1. 排序以上數字
//           2. 印出以上數字
//           3. 隨機打亂以上數字
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
			System.out.println("1輸入 2排印 3打亂印");
			opt = scanner.nextInt();
		}while(opt>3 || opt<0);
		
		switch(opt){	
		case 1:
		//輸入控制
			System.out.println("輸入數字");
			n = scanner.nextInt();		
	//		myArray(arr,n,count);
			while( n!=-1 ){
			
			//記憶體控制
			if (count == arr.length) {
	            int[] tmpArr = new int[arr.length * 2];
	            for (int i = 0; i < arr.length; i++) {
	                tmpArr[i] = arr[i];
	            }
	            arr = tmpArr;
	        }
			
			arr[count]=n;//輸入	
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
//		//記憶體控制
//		if (count == arr.length) {
//            int[] tmpArr = new int[arr.length * 2];
//            for (int i = 0; i < arr.length; i++) {
//                tmpArr[i] = arr[i];
//            }
//            arr = tmpArr;
//        }
//		
//		arr[count]=n;//輸入	
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
				//swap 重寫了 應該抽出來 swap( arr, j,j+1 )
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
			//swap 重寫了 應該抽出來  swap( arr, i,r)
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
