// double memory student'grade scores



        
// 3. 撰寫一個程式依照以下流程進行
// 讓使用者可以輸入多筆成績資料，成績資料包含 國文/英文，並將座號、國文、英文、總分儲存進陣列中
// 輸入過程中如果輸入-1則停止輸入 如果已經輸入國文成績 則必須強迫輸入英文成績(正整數)
// 讓使用者可以選擇以下選項並執行對應功能
//    1. 依照總分排名 同分則顯示同名
//    2. 依照座號排序 不需顯示名次
//    3. 離開程式

public class day11_day10hw1ans {

	public static void main(String[] args) {
		int student[][] = new int[2][];
        int count = 0;
        
        do {
            System.out.print("請輸入國文成績(-1則停止輸入):");
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            if (count == student.length) {
                int[][] tmpArr = new int[student.length * 2][];
                for (int i = 0; i < student.length; i++) {
                    tmpArr[i] = student[i];
                }
                student = tmpArr;
            }
            student[count] = new int[4];
            student[count][0] = count + 1;
            student[count][1] = n;
            System.out.print("請輸入英文成績:");
            n = scanner.nextInt();
            student[count][2] = n;
            student[count][3] = student[count][1] + student[count][2];
            count++;

        } while (true);

        int opt;
        do {
            System.out.print("請輸入選項 1~3:");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    for (int i = 1; i < count; i++) {
                        for (int j = 0; j < count - i; j++) {
                            if (student[j][3] < student[j + 1][3]) {
                                int tmp[] = student[j];
                                student[j] = student[j + 1];
                                student[j + 1] = tmp;
                            }
                        }
                    }
                    int tmpSum = -1;
                    int tmpRank = -1;
                    for (int i = 0; i < count; i++) {
                        System.out.print("座號: " + student[i][0]);
                        System.out.print(" 國文: " + student[i][1]);
                        System.out.print(" 英文: " + student[i][2]);
                        System.out.print(" 總分: " + student[i][3]);
                        if (tmpSum != student[i][3]) {
                            tmpRank = i + 1;
                            tmpSum = student[i][3];
                        }
                        System.out.println(" 名次: " + tmpRank);
                    }
                    break;
                case 2:
                    for (int i = 1; i < count; i++) {
                        for (int j = 0; j < count - i; j++) {
                            if (student[j][0] > student[j + 1][0]) {
                                int tmp[] = student[j];
                                student[j] = student[j + 1];
                                student[j + 1] = tmp;
                            }
                        }
                    }
                    for (int i = 0; i < count; i++) {
                        System.out.print("座號: " + student[i][0]);
                        System.out.print(" 國文: " + student[i][1]);
                        System.out.print(" 英文: " + student[i][2]);
                        System.out.println(" 總分: " + student[i][3]);
                    }
                    break;
            }
        } while (opt != 3);
		
		
//		int student[][] = ;
//				
//
//		do {
//			//輸入控制
//			System.out.println();
//			int n = scanner
//					
//			
//			if (n==-1)
//				break;
//			
//			
//			//記憶體控制
//			if(c==length) {
//				
//				
//			}
//			
//			//儲存
//			student[c]=new [4]	
//			student[c][0] = c+1;//座號
//			student[c][1] = n;//成績1
//			n = scanner	//輸入2
//			student[c][2]=n//儲存成績2
//			student[c][3]=[1]+[2]; //總分
//			c++;
//				
//			}
//		}while();
//		
//		
//		//選單
//		do { //選單控制結構
//			opt = ;
//			switch(opt){
//			case 1: 
//				//rank sorting 
//				
//				//searching & give a rank &print
//				
//				
//				
//			break;
//			
//			case 2:
//			break;
//			
//			
//			}
//
//		}while();
		
	}

}
