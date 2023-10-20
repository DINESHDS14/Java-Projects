package Atm;
import java.lang.*;
import java.util.*;

public class Atmmachine {
public static void main(String[] args) {

	int pin = 1234;
	int balance = 10000;
	int AddAmount = 0;
	int TakeAmount =0;
	String name;
	Scanner input = new Scanner(System.in);
	System.out.println ("Enter your pin number : ");

	int password = input.nextInt();
	if(password==pin) 
	{
		System.out.println("Enter your name : ");
		name = input.next();
		System.out.println("welcome"+name);
		while (true)
		{
			System.out.println("press 1 to check balance ");
			System.out.println("press 2 to add amount");
			System.out.println("press 3 to take amount");
			System.out.println("press 4 to receipt");
			System.out.println("press 5 to exit ");
			
			int opt = input.nextInt();
			switch(opt) 
			{
			case 1:
				System.out.println("Your current balance is "+balance);
				break;
			case 2:
				System.out.println("How much amount to be added in your account : ");
				AddAmount = input.nextInt();
				System.out.println("your amount is credited !!");
				balance = balance + AddAmount;
				System.out.println("Your Account Balance is "+balance);
				break;
			case 3:
				System.out.println("How much amount need to be debited : ");
				TakeAmount = input.nextInt();
				if(TakeAmount>balance) 
				{
					System.out.println("Your balance is insufficient !! ");
					System.out.println("Try less than your available balance ");
				}
				else
				{
					System.out.println("Your amount is debited successfully!!!");
					balance = balance - TakeAmount;
					System.out.println("Your Current balance is "+balance);
					break;
				
				}
			case 4:
				System.out.println("your available balance is "+balance);
				System.out.println("Amount credited "+AddAmount);
				System.out.println("Amount debited "+TakeAmount);
				System.out.println("Thank you have a nice day :) ");
				break;
			
				
			default:
				System.out.println("Thank you");
			}
			if(opt==5) {
			
				System.out.println("Exited Successfully !! ");
				break;
			}
		
		}

}
	else {
		System.out.println("Please check your pin number !! ");
	}

}
}
