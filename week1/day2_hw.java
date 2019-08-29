import java.util.Scanner;

public class day2_hw {


	public static void main(String[] args) {
		int income = 0;
		int netIncome;
		int salaryDeduction = 128000;
		int age;
		int exemption = 0;
		int standardDeduction = 0;
		int marriage;
		int tax = 0;
				
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("your income, enter an integer ,do not bigger than 20 billion");
		income = scanner.nextInt();
		System.out.println(income);
		
		System.out.println("enter your age, enter an integer");
		age = scanner.nextInt();
		System.out.println(age);
		
		System.out.println("enter 0 = single ,1 = married");
		marriage = scanner.nextInt();
		System.out.println(marriage);
	
		if ( income < 0 ) {
			System.out.println("error");
			tax = -1;
		} 
		
		
		if ( age >= 70 ) {
			exemption = 132000;
		} 
		else if ( age < 70 && age >= 0 ){
			exemption = 88000;
		}
		else {
			System.out.println("error");
			tax = -1;
		}
		
		
		if ( marriage == 0 ) {
			standardDeduction = 90000;
		} 
		else if ( marriage == 1 ){
			standardDeduction = 180000;
		}
		else {
			System.out.println("error");
			tax = -1;
		}
		
		
		netIncome = income - salaryDeduction - exemption - standardDeduction;

		
		if ( netIncome > 0 ){
			
			if ( netIncome <= 540000 )
				tax = (int)(netIncome * 0.05);
			
			else if ( netIncome <= 1210000 )
				tax = (int)(netIncome * 0.12) - 37800;
			
			else if ( netIncome <= 2420000 )
				tax = (int)(netIncome * 0.2) -134600;
			
			else if ( netIncome <= 4530000 )
				tax = (int)(netIncome * 0.3) - 376600;
			
			else if ( netIncome <= 103100000 )
				tax = (int)(netIncome * 0.4) - 829600;
			
			else 
				tax = (int)(netIncome * 0.45) - 1345100;
		}
		
		
		if ( tax >= 0 ) {
			System.out.println("your tax:");
			System.out.println(tax);
		}
	}	
}
