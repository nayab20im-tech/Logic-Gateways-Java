// Name : Nayab Nasir//

// Roll No :231980059 //

import java.util.Scanner;

public class TicketPricing{

public static void main(String[]args){

Scanner input=new Scanner(System.in);

System.out.print("Enter your age: ");

double age=input.nextDouble();
double price1=5.00;
double price2=8.00;
double price3=12.00;
double price4=7.00;
double price5=2.00;
{

if(age>0 && age<13)
{
System.out.println("The price of movie ticket  is: $"+ price1);
}
else{
if(age>12 && age<18)
{
System.out.println("The price of movie ticket  is: $"+ price2);
}
else{
if(age>17 && age<65)
{
System.out.println("The price of movie ticket  is: $"+ price3);
}
else{

{
System.out.println("The price of movie ticket is: $"+ price4);
}
}
{
System.out.println("Is you student?  \n   Answer in true or false");

boolean st=input.nextBoolean();



if(st==true)
{
System.out.println("You additionally get a discount of :$"+price5);

}
}
}
}
}
}//main
}//class
