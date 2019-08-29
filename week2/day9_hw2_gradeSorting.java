import java.util.Scanner;

public class day9_hw2 {
	//hw2 ¦hºû°}¦C±Æ§Ç°ÝÃD
	//«ç»ò¹j¤Ñ¤@¶}´NÃz¬µ= =
	//µM«á//ÀË¬d¤S¨S¿ù????
	//n<5·|¥X¿ù §ï¦n¤F ¤¤¶¡ªºprint¦³¼g¿ù  ª½±µ¬å±¼­«¼g
	//À³¸Ó³£¨S°ÝÃD¤F
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n =  scanner.nextInt(); //¤H¼Æ
		
		
		int [][]a = new int [n][5];// 0°ê¤å 1­^¤å 2Á`¤À 3®y¸¹ 4¦W¦¸
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = (int)(Math.random()*61+40);//³Ì§C40 ³Ì°ª100
			}
			a[i][2] = a[i][0]+a[i][1];//Á`¤À
			a[i][3] = i+1;//®y¸¹
			a[i][4] = 0;//¼È®É¦W¦¸
		}
		
		//¦L¦L¬Ý
		System.out.println("°ê ­^ Á` ®y¸¹ ¦W¦¸");
		for (int i=0; i<a.length; i++) {		
			for(int j=0; j<5; j++) {
				
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
			
			  int [] temp = new int[5];
			  for (int i = 0; i < 5 ; i++) {  //±Æ§Ç	  	
			
			  for (int j = 0; j < a.length - i -1; j++) {
			  if (a[j][2] < a[j + 1][2]) {	
				  
				  temp = a[j]; //swap °}¦C
				    	  a[j] = a[j+1];
				    	  a[j+1] = temp;	
			    	  
				      }
				  }
			  }


			
				System.out.println("°ê ­^ Á` ®y¸¹ ¦W¦¸");
				for (int i=0; i<a.length; i++) {
					a[i][4] = i+1; //¦W¦¸
					for(int j=0; j<5; j++) {
						
						System.out.print(a[i][j]);
						System.out.print(" ");
					}
					System.out.println();
				}
		  
		  
		  
	}
}
