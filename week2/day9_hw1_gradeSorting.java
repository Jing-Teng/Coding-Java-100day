import java.util.Scanner;

public class day9_hw1_gradeSorting {
	//hw2 �h���}�C�Ƨǰ��D
	//���j�Ѥ@�}�N�z��= =
	//�M��//�ˬd�S�S��????
	//n<5�|�X�� ��n�F ������print���g��  �����屼���g
	//���ӳ��S���D�F
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n =  scanner.nextInt(); //�H��
		
		
		int [][]a = new int [n][5];// 0��� 1�^�� 2�`�� 3�y�� 4�W��
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = (int)(Math.random()*61+40);//�̧C40 �̰�100
			}
			a[i][2] = a[i][0]+a[i][1];//�`��
			a[i][3] = i+1;//�y��
			a[i][4] = 0;//�ȮɦW��
		}
		
		//�L�L��
		System.out.println("�� �^ �` �y�� �W��");
		for (int i=0; i<a.length; i++) {		
			for(int j=0; j<5; j++) {
				
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
			
			  int [] temp = new int[5];
			  for (int i = 0; i < 5 ; i++) {  //�Ƨ�	  	
			
			  for (int j = 0; j < a.length - i -1; j++) {
			  if (a[j][2] < a[j + 1][2]) {	
				  
				  temp = a[j]; //swap �}�C
				    	  a[j] = a[j+1];
				    	  a[j+1] = temp;	
			    	  
				      }
				  }
			  }


			
				System.out.println("�� �^ �` �y�� �W��");
				for (int i=0; i<a.length; i++) {
					a[i][4] = i+1; //�W��
					for(int j=0; j<5; j++) {
						
						System.out.print(a[i][j]);
						System.out.print(" ");
					}
					System.out.println();
				}
		  
		  
		  
	}
}
