package App;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		int a;
		String name= "Aman", cid="abc123";
		Deposite dep = new Deposite();
		Scanner scan = new Scanner(System.in);
			System.out.println("***************");
			System.out.println("Welcome "+name+"\n");
			System.out.println("Your Customer id is "+cid+"\n");
			
			do {
				
			System.out.println("****************");
			System.out.println("Choose one options from below.");
			System.out.println("1. Deposite");
			System.out.println("2. Widthdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Previous Transaction");
			System.out.println("5. Exit");
			System.out.println("***************");

			 a = scan.nextInt();
			 
			 switch(a) {
			 case 1:{
					System.out.println("Enter the amount of deposite.\n");
					
					double x = scan.nextDouble();
				 dep.depos(x);
				 break;
			 }
			 case 2:{
				 System.out.println("Enter the amount of widthdrawl");
				 double x= scan.nextDouble();
				 dep.width(x);
				 break;
			 }
			 
			 case 3 :{
				 double x= dep.balance();
				 System.out.println("Your amount is:"+x);
				 break;
			 }
			 case 4:{
				 dep.previousbalance();
				 break;
			 }
			 case 5:{
				 System.out.println("");
			 }
			 }
			 
			
			}while(a!=5);
		
			if(a==5) {
				System.out.println("You have been logged out!!");
				System.out.println("Thank you for using Application.");
				System.out.println("Have a good day "+name);
			}
			
			scan.close();
	}

}
