import java.util.Scanner;

public class day9_hw0_gradeSorting {
	//sorting �y��&���Z
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		
		int ARR;		
		int v = 0;
		while ( v!=3 ) {
			System.out.println("�п�J�ǥͤH��"); //�@�~2 �令�ʺA��J  �����J-1
			ARR = scanner.nextInt();		
			int[] a,b,c;
			
			a = new int[ARR];
			System.out.println("�п�J�ǥͦ��Z");
			for (int i=0; i<a.length; i++) {
				//System.out.println(a[i]);
				do {
					a[i] = scanner.nextInt();
					
				}while(a[i]<0 || a[i]>100);
			}		

		System.out.println("���s��J�Ы�0, �C�L�Ы�1 ,��z��C�L�Ы�2, ���}�{���Ы�3 ");
		v = scanner.nextInt();

		switch (v){
		case 1:
			for (int i=0; i<a.length; i++) {
				System.out.println("�y��: "+i+" ����: "+a[i]);
			}
		break;
		
		case 2:
			int sit[];
			sit = new int[a.length];			
			for (int j=0; j<a.length; j++) {
				sit[j] = j;
			}
			
			  //int[] array2=a.clone();
			  for (int i = 0; i < a.length; i++) {
				  	int temp;
				    for (int j = 0; j < a.length - i -1; j++) {
				      if (a[j] > a[j + 1]) {
//				        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
				      //swap
				      
				    	  temp = a[j];
				    	  a[j]=a[j+1];
				    	  a[j+1]=temp;
				    	  
				    	  temp = sit[j];
				    	  sit[j]=sit[j+1];
				    	  sit[j+1]=temp;
				    	  
			      }
				}
				for (int j=0; j<a.length; j++) {
					System.out.println(" �y��  " + sit[j]+1 +" ���Z " + a[j]);

				}
				break;
			  
			  }
			  
			  
		
		}
		
		}	
	}
}
