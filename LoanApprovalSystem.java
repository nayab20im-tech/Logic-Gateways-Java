// Name : Nayab Nasir //

// Roll No : 231980059 //

import java.util.Scanner;

public class LoanApprovalSystem{

public static void main(String[]args){

Scanner input=new Scanner(System.in);

System.out.print("Enter your credit score: ");

double creditscore=input.nextDouble();

if(creditscore>750)
{
System.out.println("You get a special offer");
}

System.out.print("Enter your annual income: $");

double annualincome=input.nextDouble();

if((creditscore>700)&&(annualincome>50000))
{
System.out.println("Loan is approved");
}
else{
if((creditscore>=600 || creditscore<=700)&&(annualincome>40000))
{
System.out.println("Loan is approved with a co_signer");
}
else{
System.out.println("Loan is rejected");
}



}
}//main
}//class
