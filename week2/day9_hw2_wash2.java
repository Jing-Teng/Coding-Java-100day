package week2;

//�o�ӬO�̷s�� ^_^

//swap ��ƵP
//���ӭn�m�ߥ] function
//print ���G�٬O���� �֤@�i�P �@�����|���@�i�®�A�L����
public class day9_hw2_wash2 {

	public static void main(String[] args) {
		
		int[][] a= new int[52][2]; //�P���s�X ����
		
			for(int j=0; j<52; j++) {
				a[j][0] = j+1;
				a[j][1] = (int)(Math.random()*52+1);  //�p�G�n�إ�1~52���üƴN�n*52+1
			
			}
//			System.out.println();
//			for(int j=0; j<52; j++) {
//				System.out.print(a[j][0]+" ");
//				System.out.println(a[j][1]);
//			}
//			System.out.println();
			
			
			  for (int i = 0; i < a.length; i++) {  //�Ƨ�
				  	int[] temp = new int[2];	
				  	for (int j = 0; j < a.length - i -1; j++) {
//				      if (a[j][1] > a[j + 1][1]) {	
//				    	  temp = a[j][0]; //swap �P
//				    	  a[j][0]=a[j+1][0];
//				    	  a[j+1][0]=temp;
//				    	  
//				    	  temp = a[j][1]; //swap �Ǹ�
//				    	  a[j][1]=a[j+1][1];
//				    	  a[j+1][1]=temp;	

//					      if (a[j][1] > a[j + 1][1]) {	
//					    	  temp[j] = a[j][0]; //swap ��ƵP
//					    	  a[j][0]=a[j+1][0];
//					    	  a[j+1][0]=temp[j];

					      if (a[j][1] > a[j + 1][1]) {	
					    	  temp = a[j]; //swap ��ƵP
					    	  a[j]=a[j+1];
					    	  a[j+1]=temp;

				      }
				  }
			  }
		
			  int fuck1=0;
			  int fuck2=0;
			  int fuck3=0;
			  int fuck4=0;
			  int z,w;
				for(int j=0; j<a.length; j++) {

					System.out.print((j+1) +" ");
//					if (j%14==13)
//						System.out.println();
					
					w = (a[j][0]-1)/13;
					z = (a[j][1])%13 +1 ; //�z~~~~~~~~~~~ debug de����
					
					//System.out.println(z);
					
					
					switch(w) {
					case 0:						
						System.out.print("�®�");
						System.out.println(z);
						fuck1++;
						break;
					case 1:
						
						System.out.print("����");
						System.out.println(z);
						fuck2++;
						break;
					case 2:
						
						System.out.print("���");
						System.out.println(z);
						fuck3++;
						break;
					case 3:
						
						System.out.print("����");
						System.out.println(z);
						fuck4++;
						break;	
					}
					

				}
				
				
				System.out.println(fuck1);
				System.out.println(fuck2);
				System.out.println(fuck3);
				System.out.println(fuck4);
				
				
	}

}
