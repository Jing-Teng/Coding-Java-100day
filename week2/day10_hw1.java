import java.util.Scanner;
//�i��J ���/�^�� ���i���ŭ�
//�i�H��ܨ̷�:
//�`���ƦW �`���ۦP�W���ۦP
//�y���Ƨ� ����ܦW��
//���}


public class day10_hw1 {

	public static void main(String[] args) {
		int [][]a;
		
		a = new int[2][5]; //��� �^�� �`�� �y�� �W��
		int n = 0;
		int i = -1;
		int opt;
		Scanner scanner= new Scanner(System.in);

			do {
				do {
					System.out.println("1���s��J���Z 2���Ӯy���L�X 3���ӦW���L�X 4���}");
					opt =  scanner.nextInt();	
				}while ( opt<1 || opt>4 ); 
				
				switch(opt) { //���
					case 1:
						//���_��J�ǥͦ��Z
						do  {
							System.out.println("i = " + i);
							if ( i < a.length) { 	
								i++;
						    }
							if ( i == a.length) {
					        	int [][]newArray = new int[a.length * 2][5]; 
					        	 
								for (int j = 0; j < a.length; j++) { 	
									newArray[j] = a[j];
									
								}
								a = newArray;
					        	 
							}
		
							System.out.println(a.length);
							System.out.println();
						    do {
								System.out.println("��J���");
								a[i][0] = scanner.nextInt();
						    }while( a[i][0]<-2 || a[i][0]>100 );
							if ( a[i][0] == -1 ) {break;}
							
							do {
								System.out.println("��J�^��");
								a[i][1] = scanner.nextInt();
								n++;
							}while(a[i][1]<=0 || a[i][1]>100);
							

						} while( a[i][0]>=0 || a[i][0]<100 );
						
						
						break;
					case 2:
						for (int j=0; j<n; j++) {
							System.out.println("�y��: " + (j+1)+" ���Z: "+ (a[j][0]+a[j][1]) );
						}
						break;
					
					case 3:
						System.out.println(n);
						
						int []temp = new int[5];
						for (int j=0; j<n; j++) {
							a[j][3] = j+1; //�y��
							a[j][2] = a[j][0]+a[j][1];
						}
						for (int j=0; j<n; j++) { //�S�����Tsorting �̫�@���S���� ���On�Olength���ӨS��
							for (int k=0; k<n-j-1; k++) { 
								if ( a[k][2] < a[k+1][2]) { //�o�̼g���F �o��H�U����ټgj �̲�
									temp = a[k];
									a[k] = a[k+1];
									a[k+1] = temp;
								} 		
							}	
						}
						int rank = 1; //�W��
						a[0][4] = 1;
						for (int j=0; j<n; j++) {
							if( a[j][2] > a[j+1][2] ) {
								
								a[j+1][4] = ++rank;
								
							}
							else {
								a[j+1][4] = a[j][4];
								++rank;
							}
							
							
						}
						for (int j=0; j<n; j++) {
							System.out.println("�y��: " + (a[j][3])+" ���Z: "+ (a[j][0]+a[j][1]) +" �W��: "+ a[j][4]);
						}
						break;

					}
			}while( opt!=4 );//do
		 
		
	}

}
