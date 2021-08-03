package com.greatlearning.prework.assignment1;
import java.util.Scanner;

public class TestJava {
	Scanner sc = new Scanner(System.in);
	
	//function to checkPalindrome

    public void checkPalindrome()  {
    	int temp, rem, sum=0,inp;
    	inp = validateInput();
    	temp = inp;
    	while(inp>0) {
    		rem = inp%10;
    		sum = (sum*10) + rem;
    		inp /= 10;
    	}
    	if (sum == temp) {
    		System.out.println(temp+" is palindrome");
    	}
    	else {
    		System.out.println(temp+" is not palindrome ");
    	}

   }

         //function to printPattern

    public void printPattern() {
    	int inp;
    	inp = validateInput();
    	for(int i = inp-1;i>=0;i--) {
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
   }

       //function to check no is prime or not

     public void checkPrimeNumber() {
    	int inp,m=0,i,flag=0;
     	inp = validateInput();
     	m=inp/2;
     	if(m==1) {
     		System.out.println(inp+" is not a prime number");
     		
     	}
     	else {
     		for(i=2;i<=m;i++) {
     			if(inp%i == 0) {
     				System.out.println(inp+" is not prime number"); 
     				flag = 1;
     				break;
     			}
     		}
     		if(flag==0) {
     			System.out.println(inp+" is prime number");
     		}
     	}
     }

       // function to print Fibonacci Series

       public void printFibonacciSeries() {

             //initialize the first and second value as 0,1 respectively.

        int first = 0, second = 1, inp,i;
        inp = validateInput();
        int res[] = new int[inp];
        res[0] = first;
        res[1] = second;
        i=first+second;
        System.out.print(res[0]+", "+res[1]);
        while(i<inp-1) {
        	res[i+1] = res[i] + res[i-1]; 
        	System.out.print(", "+res[i+1]);
        	i++;
        }
        System.out.println();
        
       }
       public int validateInput() {
    	   int inp;
        	do { 
        		System.out.println("Enter a positive number: ");
        		while(!sc.hasNextInt()) {
        			System.out.println("Input is not an integer");
        			sc.next();
        		}
        		inp = sc.nextInt();
        	}while(inp<=0);
        	return inp;
       }


//main method which contains switch and do while loop

   public static void main(String[] args) {

             TestJava obj = new TestJava();

             int choice;

             Scanner sc = new Scanner(System.in);

             do {

            	 System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            	 System.out.println();

            	 choice = sc.nextInt();

            	 switch (choice) {
            	 	case 0:
            	 		choice = 0;
            	 		break;

            	 	case 1: {

            	 		obj.checkPalindrome();

            	 	}
            	 		break;

            	 	case 2: {

            	 		obj.printPattern();

            	 	}

            	 		break;

            	 	case 3: {

            	 		obj.checkPrimeNumber();

            	 	}

            	 		break;

            	 	case 4: {

            	 		obj.printFibonacciSeries();
            	 	}

            	 		break;
            	 		
            	 	default:

            	 		System.out.println("Invalid choice. Enter a valid no.\n");

            	 }

             } while (choice != 0);

             System.out.println("Exited Successfully!!!");

             sc.close();

   }

}


