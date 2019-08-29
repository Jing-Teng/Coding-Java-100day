public class day9_wash3 {

	public static void main(String[] args) {
		
		int[][] a= new int[52][2]; //µPªº½s½X ¶¶§Ç
		
			for(int j=0; j<52; j++) {
				a[j][0] = j+1;
				a[j][1] = (int)(Math.random()*52+1); //¬O*52+1
			}
		
//			for(int j=0; j<52; j++) {
//				System.out.println(a[j][0]);
//			}
//			for(int j=0; j<52; j++) {
//				System.out.println(a[j][1]);
//			}
			
//			  for (int i = 0; i < a.length; i++) {  //±Æ§Ç
//				  	int temp[] = new int[52];				  	
//				  	for (int j = 0; j < a.length - i -1; j++) {
//				      if (a[j][1] > a[j + 1][1]) {	
//				    	  temp[j] = a[j][0]; //swap ±Æ§Ç
//				    	  a[j][0]=a[j+1][0];
//				    	  a[j+1][0]=temp[j];
//				    	  
//				      }     
//				  }
//				  	
				  	
					for(int j=0; j<52; j++) {
					System.out.println(a[j][0]);
				}
					
//				  	int z,w;
//					if (i%14==13)
//						System.out.println();
//					
//					w = a[i][0]/13;
//					z = a[i][0]%14; //«z
//
//					switch(w) {
//					case 0:						
//						System.out.print("¶Â®ç");
//						System.out.println(z);
//						break;
//					case 1:
//						
//						System.out.print("¬õ¤ß");
//						System.out.println(z);
//						break;
//					case 2:
//						
//						System.out.print("¤è¶ô");
//						System.out.println(z);
//						break;
//					case 3:
//						
//						System.out.print("±öªá");
//						System.out.println(z);
//						break;	
//					}
			  }
		
		
			  int z,w;
				for(int j=0; j<a.length; j++) {

					//System.out.println(a[j][0]);
					if (j%14==13)
						System.out.println();
					
					w = a[j][0]/13;
					z = a[j][0]%14; //«z
					
					//System.out.println(z);
					
					
					switch(w) {
					case 0:						
						System.out.print("¶Â®ç");
						System.out.println(z);
						break;
					case 1:
						
						System.out.print("¬õ¤ß");
						System.out.println(z);
						break;
					case 2:
						
						System.out.print("¤è¶ô");
						System.out.println(z);
						break;
					case 3:
						
						System.out.print("±öªá");
						System.out.println(z);
						break;	
					}
					
					
					
				}
				
				
				
				
				
	}

}
