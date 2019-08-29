import java.util.Scanner;

//不斷輸入程式直到-1 找出最大最小
//承上 找出使用者輸入的n的位置 找不到顯示-1 
//排列後印出
//離開

public class day10_hw2 {

	public static void main(String[] args) {
		int []a;
		
		a = new int[2]; 
		int input = 0,count=0; 
//		int i = -1;
//		int opt;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("輸入正整數");
			
		
		do {
		input = scanner.nextInt();
		
		if (input != -1) {  //存入前先判斷
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
			
		System.out.printf("最小是  %d 位置在 %d \n", min,minIndex);
		
		System.out.println("輸入查詢值");
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
				System.out.printf("位置在 %d \n", fIndex[i]);
			}
			if( qq == (-1)*count ) {
				System.out.print("找不到");
			}
		}


		
		
		
	}

}
