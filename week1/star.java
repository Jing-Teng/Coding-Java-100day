import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int qw = scanner.nextInt();
		
		int square = scanner.nextInt();
		
		int i, j, k;
		
		switch(square)
		{
		case 1:
			//���
			for (i=0; i<qw; i++)
			{
				   for (j=0; j<qw; j++)
			      {
			           System.out.print("*");
			      }
				   System.out.print("\n");
			}
			System.out.print("\n");
			break;
		
		case 2:
			for ( i=0; i<qw; i++)
			{
				if (i==0)
			    {
				    for (k=0; k<qw; k++)
				          System.out.print("*");
			    }
			    else if (i >= 1 && i <= qw-2)
			    {
				    System.out.print("*");
				    for ( j=0; j<qw-2; j++)
				    {
				           System.out.print(" ");
				    }
			 	    System.out.print("*");
			    }
			    else if (i == qw-1)
			    {
			 	    for (i=0; i<qw; i++)
				          System.out.print("*");
			    }
				System.out.print("\n");
			}
			break;
		
		case 3:
			for (i=0; i<qw; i++)
			{
				   for (j=0; j<qw-i; j++)
			      {
			 		 System.out.print("*");
			      }
				   System.out.print("\n");
			}
		break;
		
		case 4:
			// �����T�� ���W
			for (i=0; i<qw; i++)
			{
				   for (j=0; j<qw-i-1; j++)
			      {			 		
			 		System.out.print(" ");
			      }
				   for (k=0; k<qw-j; k++)
				      {
				 		 System.out.print("*");
				      }
				   System.out.print("\n");
			}
			
			// �����T�� ���U
			for (i=0; i<qw; i++)
			{
				   for (j=qw; j>qw-i; j--)
			      {
			 		System.out.print(" ");
			      }
				   for (k=qw-i; k>0; k--)
				      {
				 		 System.out.print("*");
				      }
				   System.out.print("\n");
				   
			}

		break;
		
		
		case 5:
			// �����T�� �k�W
			for (i=0; i<qw; i++)
			{
				   for (j=qw; j>qw-i-1; j--)
			      {
			 		
			 		System.out.print("*");
			      }   
				   System.out.print("\n");
			}
			// �����T�� �k�U
			for (i=0; i<qw; i++)
			{
				   for (j=0; j<qw-i; j++)
			      {
			 		 System.out.print("*");
			      }
				   System.out.print("\n");
			}
			break;
			

		
		case 6:
			// ���y�T�� 
//			001 
//			0111
//			11111
//			0111
//			001
			
			for (i=0; i<qw; i++)
			{		
			   for (j=0; j<qw-i-1; j++)
		      {
		 		 System.out.print("0");
		 		 
		      }
			   for (k=0; k<2*i+1; k++)
		      {
		 		 System.out.print("1"); 		
		      }
			   System.out.print("\n");
			}
			for (i=0; i<qw; i++)
			{		
			   for (j=0; j<i+1; j++)
		      {
		 		 System.out.print("0");
		 		 
		      }
			   for (k=0; k<2*(qw-(i+1))-1; k++)
		      {
		 		 System.out.print("1"); 		
		      }
			   System.out.print("\n");
			}
			break;
		
		
		case 7:
			//abs 
			//�ƦC�W�h 2,1,0,1,2 ����F��|�ܤp�S�ܤj 
			for (i=0 ; i<qw ; i++) {
				for (j =0; j< Math.abs(qw/2-i);j++) {
					System.out.print(" ");	
				}
				for (j =0; j< qw-Math.abs(qw/2-i)*2;j++) {
					System.out.print("*");	
				}
				System.out.print("\n");	
			}
			break;
		
		case 8:
		    for (i = 1; i <= qw; i++) {
		        for ( j = qw; j > i; j--) {
		          System.out.print(" ");
		        }
		        for (k = 1; k < i * 2; k++) {
		          System.out.print("*");
		        }
		        System.out.println();
		      }
		      for (i = qw-1; i > 0; i--) {
		        for ( j = qw; j > i; j--) {
		          System.out.print(" ");
		        }
		        for ( k = 1; k < i * 2; k++) {
		          System.out.print("*");
		        }
		        System.out.println();
		      }
		      break;

		case 9:
			//�ŤߤT����
			
//			   *
//			   **
//			   * *
//			   *  *
//			   *****
			//�Ĥ@��M�̫�@�檺�P�_���@��
			//����: ���ޫ�˥��L���* 

			break;
			
		case 10:
			//�Ťߵ٧� 1
			//�b��ߵ٧θ̰� if-else �P�_
			for (i=0 ; i<qw ; i++) {					
				for (j =0; j< Math.abs(qw/2-i);j++) {
					System.out.print(" ");	
				}
				if ( i!=0 && i!=qw-1) {
					System.out.print("*");
				}			
				for (j =0; j< qw-Math.abs(qw/2-i)*2-1;j++) {
						System.out.print("-");	
				}
				System.out.println("#");
			}
					
			
			break;
		case 11:
			//�Ťߵ٧� 2
			//��X����A��k��p�٧�
//			--*
//			-*-#
//			*---#
//			-*-#
//			--*
			//�p�٧Ϊ��Y�����e#
			for (i=0 ; i<qw ; i++) {
				for (j =0; j< Math.abs(qw/2-i);j++) {
					System.out.print(" ");	
				}
				System.out.print("*");
				for (j =0; j< qw-Math.abs(qw/2-i)*2-2;j++) {
					System.out.print(" ");	
				}
				if ( i!=0 && i!=qw-1) {
					System.out.print("#");
				}
				System.out.print("\n");	
			}
			break;
		
		
		case 12:
			//�F ��ӥL���٧ήڥ����O��� �O���� ���ǧڬݤ��� �o�Ӧ����D
			for (i=0; i<qw/2+1; i++) 
			{		
			   for (j=0; j<qw/2-i; j++)
		      {
		 		 System.out.print(" ");
		 		 
		      }
			   for (k=0; k<2*i+1; k++)
		      {
		 		 System.out.print("1"); 		
		      }
			   System.out.print("\n");
			}
		
			for (i=0; i<qw/2+1; i++) 
			{		
			   for (j=0; j<i+1; j++) //�ťդ��Χ�
		      {
		 		 System.out.print(" ");
		 		 
		      }
			   for (k=0; k<qw-2*i-2; k++)  //3 -2*i => (n/2)- 2*1 +2)
		      {
		 		 System.out.print("1"); 		
		      }
			   System.out.print("\n");
			}
			break;
			
			//�o�{�ä��O�o�Ӥ���
			
			//�٧ΰ�=5 ; ���=3
			//7 ; 4
			//9 ; 5
			
			// 7/2 - 0 + 2 =5
			// 7/2 - 2 + 2 =3
			
		}	
	}
}
