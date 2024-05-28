package Assignment;

import java.util.Scanner;

public class Assignmentbanking{   
 
 static String Username;              
 
 static int order;    
 
 static Scanner sc = new Scanner(System.in); 
 
 static String accnumber[] = {"1001001001","1001001002","1001001003","1001001004","1001001005"};
 
 static double balance[] = {40000.00,250000.00,60000.00,400000.00,50500.00}; 
 
 static int invalidtimes = 0;
 
 
 public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  boolean status = false;               
	  
	  char dywtc;
	  
	  String username[] = {"James","Chris","Ruby","Ronin","Etoo"};     
	  
	  String pass[] = {"1234","5678","9011","1213","1415"};     
	  
      System.out.println("Tap Enter to Start the Program");
	  
	  
	  do {
		  	sc.nextLine(); //for invalid
		  	
		  	System.out.print("Enter Bank User Name: ");          
		  	Username = sc.nextLine();
	  
		  	System.out.print("Enter Bank User Passowrd: ");        
		  	String password = sc.next();
	  
	  
	  for(int i = 0; i < 5; i ++) {
		  
		  	if ( Username.equals(username[i]) && password.equals(pass[i]) ) 
		  	
		  	{
		  		System.out.println("");
		  		
		  		System.out.println("Login Successful");
		  		
		  		System.out.println("");
	    
		  		status = true;
		  		order = i;
		  		break;
		  		
		  	} 
	   
	  }
	  
	  if (!status) {
		  
	      System.out.println("");
		  
		  System.out.println("Invalid Login! ");
	   
		  System.out.println("Enter the Username and Password Again");
		  
	      System.out.println("");
	      
	      invalidtimes++;


	      
	      if (invalidtimes == 5) 
	      
	      {
	    	  
              System.out.println("Too many invalid. Please Try Again Later!");
              
              System.exit(0);
              
          }
	      
	  }
	  
	  }while(!status);
	  
	  
		  System.out.println("Welcome ICICI Banking System");
		  
		  System.out.println("Welcome " + Username );
		  
		  System.out.println("");
		  
		  System.out.println("1. Check the Account Balance");
		  
		  System.out.println("2. To Withdraw the account balance");
		  
		  System.out.println("3. To Deposit the account balance");
		  
		  System.out.println("4. Close the program");
		  
		  System.out.println("");
		 
	  
	  do {
		  
		  System.out.print("Choose Your Desired Process - ");
		  
		  int option = sc.nextInt();
		  
	  
		  switch (option) {
		  
		  case 1 : CheckBalance();    	 break;
		  case 2 : Withdraw();    		 break;
		  case 3 : Deposit();      		 break;
		  case 4 : Exit();       break;
		  default: System.out.println("You must be enter 1 to 4");
	  
	  }
		  
	      System.out.println("");
	      
		  System.out.println("Do you want to continue(Y/N)");
		  
		  dywtc = sc.next().charAt(0);
	 
		  
	  } while(dywtc == 'Y');
	  
		  System.out.println("End program");
		  
	  
	 }
 
	
	 public static void CheckBalance() 
	 
	 {
			  
		 	  System.out.println("");
		 
			  System.out.println("Userame - " + Username);
			  
			  System.out.println("Account Number - " + accnumber[order]);
			  
			  System.out.println("Account Balance - " +  balance[order]);
	
	 }
	 
	 public static void Withdraw()
	 
	 {
		 
		      System.out.println("");
		 
			  System.out.println("Enter withdraw ammount - ");
			  
			  double withdraw = sc.nextDouble();
			  
			  System.out.println("");
			  
			  System.out.println("Userame - " + Username);
			  
			  System.out.println("Account Number - " + accnumber[order]);
			  
			  System.out.println("Withdraw Balance - " + withdraw);
			  
			  balance[order] = balance[order] - withdraw;
			  
			  System.out.println("Current balance: " + balance[order]);
			  
	 }
	 
	 public static void Deposit() 
	 
	 {
		 
		      System.out.println("");
		 		
			  System.out.println("Enter deposit amount - ");
			  
			  double deposit = sc.nextDouble();
			  
		      System.out.println("");
			  
			  System.out.println("Userame - " + Username);
			  
			  System.out.println("Account Number - " + accnumber[order]);
			  
			  System.out.println("Deposit Balance - " + deposit);
			  
			  balance[order] = balance[order] + deposit;
			  
			  System.out.println("Current balance: " + balance[order]);
	 }
 
	public static void Exit()
		 
	{
	          System.out.println("");			 
		
			  System.out.println("This system is ended successfully");
			 	
			  System.exit(0);
			   
	}

}