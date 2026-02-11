//Name : Nayab Nasir//

//Roll No : 231980059//

import java.util.Scanner;
public class GradingSystem{
public static void main (String[]args){
Scanner input=new Scanner(System.in);
System.out.println("Enter your score");
double score=input.nextDouble();

if(score>95 )
{
System.out.println("Grade A");
System.out.println("Excellent");
}
else{
if(score>=90)
{
System.out.println("Grade A");
}
else{
if(score>=80 && score<=89)
{
System.out.println("Grade B");
}
else{
if(score>=70 && score<=79)
{
System.out.println("Grade C");
}
else{
if(score>=60 && score<=69)
{
System.out.println("Grade D");
}
else{
System.out.println("Grade F");
}
}
}
}
}
}//main
}//class

