import java.util.Scanner;

public class day9_searchingAns {
	//day9_searching的解答
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("幾個數字");		
		int n = scanner.nextInt();
		int arr[] =  new int [n];

//		
//		//輸入
//		
//		int opt; //選單
//		
//		do {
//			//選單
//			switch(opt) {
//			case 1:
//				//交換 成績+座號
//				
//			}
//		}while();	
			
			
		//比大小
		for(int i=0;i<arr.length;i++) {
			do {
				System.out.println("請輸入正整數");	
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
		
		System.out.println("最小位置:  "+mindex + "值:  " + min);
		System.out.println("最大位置:  "+Mindex + "值:  " + max);
	}
}
