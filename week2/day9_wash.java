//print ���G����

import java.util.Scanner;

public class day9_wash {

	public static void main(String[] args) {
		
		int[][] a= new int[52][2]; //�P���s�X ����
		
			for(int j=0; j<52; j++) {
				a[j][0] = j+1;
				a[j][1] = (int)(Math.random()*51+1);
			}
		
//			for(int j=0; j<52; j++) {
//				System.out.println(a[j][1]);
//			}

			
			  for (int i = 0; i < a.length; i++) {  //�Ƨ�
				  	int temp;
				  	
				  	for (int j = 0; j < a.length - i -1; j++) {
				      if (a[j][1] > a[j + 1][1]) {	
				    	  
					    	  temp = a[j][1]; //swap �üƧǸ�
					    	  a[j][1]=a[j+1][1];
					    	  a[j+1][1]=temp;	
					    	  
					    	  temp = a[j][0]; //swap �ƪ��s�X
					    	  a[j][0]=a[j+1][0];
					    	  a[j+1][0]=temp;
				    	  
				      }
				  }
			  }
		
		
			  int z,w;
				for(int j=0; j<52; j++) {
					w = a[j][0]/13;
					z = a[j][0]%13+1;
					if (j%14==13)
						System.out.println();
					switch(w) {
					case 0:						
						System.out.print("�®�");
						System.out.println(z);
						break;
					case 1:
						
						System.out.print("����");
						System.out.println(z);
						break;
					case 2:
						
						System.out.print("���");
						System.out.println(z);
						break;
					case 3:
						
						System.out.print("����");
						System.out.println(z);
						break;
					
					
					
					}
					
					
					
				}
				
				
				
				
				
	}

}
