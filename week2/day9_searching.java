import java.util.Scanner;

public class day9_searching {
	//��J�@��Ʀr �ÿ�X�̤j�̤p����m
	//���ӬO�n��searching����
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("��J�@��Ʀr -1����");
		int x = 0; //real length
		
		int []arr; //input
		int COUNT = 10000000;
		arr = new int[COUNT];
		
		int w =  scanner.nextInt();
		while ( w != -1 ) {						
			arr[x] = w;
			x++;
			w =  scanner.nextInt();			
		}
//		for (int j=0; j<x; j++) {
//			System.out.println(arr[j]);
//		}		
		int sit[];  //�y��
		sit = new int[x];			
		for (int j=0; j<x; j++) {
			sit[j] = j;
		}
	
		int[] a; //copy arr
		a = new int[x];
		for (int j=0; j<x; j++) {
			a[j] = arr[j];
		}
				
	  for (int i = 0; i < a.length; i++) {
			int temp;
			for (int j = 0; j < a.length - i -1; j++) {
			  if (a[j] > a[j + 1]) { //swap
			    	  
				  	
				  	  temp = a[j];
			    	  a[j]=a[j+1];
			    	  a[j+1]=temp;
			    	  
			    	  temp = sit[j];
			    	  sit[j]=sit[j+1];
			    	  sit[j+1]=temp;
			  }}}
		  
		  System.out.println("^_^ �̤p�ƭ�: " + a[0] + " ��m:  " + (sit[0]+1));
		  
		  int max=x-1;
		  
		  while ( a[max] == a[max-1]) {
			  max--;
		  }
		  System.out.println("^_^ �̤j�ƭ�: " + a[max] + " ��m:  " + (sit[max]+1) );
		  
	  
		
	}
}
