import java.util.Scanner;

// double memory & searching


//1. 撰寫一個程式依照以下流程進行
// 讓使用者不斷輸入正整數直到輸入-1停止
// 找出使用者輸入的數字中的最大值與最小值，印出對應的位置與值

// 2. 基於第一題 讓使用者可以選擇3個選項並執行對應功能
//    1. 輸入一個數字 並查找此數值位於陣列中的位置 找不到則顯示-1
//    2. 將陣列中的數字從小到大排列並印出(印出後原陣列的順序會改變為排列後的順序)
//    3. 離開程式

public class day11_day10hw2ans {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int num[] = new int[2];
        int count = 0;
        do {
            // 讓使用者不斷輸入正整數直到輸入-1停止
            System.out.print("請輸入正整數:");
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            if (n < 0) {
                continue;
            }

            if (count == num.length) {
                int tmpArr[] = new int[num.length * 2];
                for (int j = 0; j < num.length; j++) {
                    tmpArr[j] = num[j];
                }
                num = tmpArr;
            }
            num[count++] = n;
        } while (true);

        // 找出使用者輸入的數字中的最大值與最小值，印出對應的位置與值
        int min, max;
        int minIndex, maxIndex;
        min = max = num[0];
        minIndex = maxIndex = 0;
        for (int i = 1; i < count; i++) {
            if (num[i] > max) {
                maxIndex = i;
                max = num[i];
            }
            if (num[i] < min) {
                minIndex = i;
                min = num[i];
            }
        }
        System.out.println("max: " + max + " maxIndex: " + maxIndex);
        System.out.println("min: " + min + " minIndex: " + minIndex);

        int opt;
        do {
            System.out.print("請選擇選項1~3:");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    //    1. 輸入一個數字 並查找此數值位於陣列中的位置 找不到則顯示-1
                    System.out.print("請輸入一個數字來查找位置:");
                    int key = scanner.nextInt();
                    int index = -1;
                    for (int i = 0; i < count; i++) {
                        if (key == num[i]) {
                            index = i;
                            break;
                        }
                    }
                    System.out.println(((index == -1) ? "找不到" : (key + " 位於第 " + index + " 個位置")));
                    break;
                case 2:
                    //    2. 將陣列中的數字從小到大排列並印出(印出後原陣列的順序會改變為排列後的順序)
                    for (int i = 1; i < count; i++) {
                        for (int j = 0; j < count - i; j++) {
                            if(num[j] > num[j+1]){
                                int tmp = num[j];
                                num[j] = num[j+1];
                                num[j+1] = tmp;
                            }
                        }
                    }
                    for(int i=0;i<count;i++){
                        System.out.print(num[i] + " ");
                    }
                    System.out.println();
            }
        } while (opt != 3);
}}
		
		
//		
//		do {
//			//輸入控制
//			int n = scanner.nextInt();
//			if(n==-1)
//				break;
//			if(n<0)
//				continue;
//			
//			//記憶體控制
//			if (i == n[num.length]) {
//				int temp = new [num. *2];
//				for(int j=0;;) {
//					temp[j] = num[j];
//				}
//				num = temp;
//				
//			}
//			//找最大最小
//			int min, max;
//			int minIndex=-1, maxIndex=-1;
//			min = max = num[0];
//			for(int i=0;;) {
//				if(num[i]>max) {
//					max=num[i];
//					maxIndex=i;			
//				}
//				if(num[i]<min) {
//					min=num[i];
//					minIndex=i;			
//				}
//			}
//			
//			
//			num[i++] = n;
//		}while(true);
//
//		System.out.println();
//		System.out.println();
//		
//		
//		//選項
//		int opt;
//		do {
//			opt = scanner.nextInt();
//			switch(opt) {
//			case 1: //查找位置
//				
//				int key = scanner
//				int index=-1;
//				for(int i=0;;) {
//					if(key==num[i]) {
//						index[i]=i;
//						break;
//					}
//					
//				}
//				System.out.println();
//			
//			break;
//			}
//			case 2: //從小到大排列
//				
//				for(int i=0;;) {
//					for(int j=0;;) {
//						if() {
//							
//						}						
//					}
//				}
//			break;
//			
//		}while(opt!=);
//		
//		
//	}
//}
