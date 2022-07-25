import java.util.Scanner;

public class calPercentage {
public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);	
System.out.print("Enter marks for subject 1:- ") ;
int s1= sc.nextInt();	
System.out.print("Enter marks for subject 2:- ") ;
int s2= sc.nextInt();	
System.out.print("Enter marks for subject 3:- ") ;
int s3= sc.nextInt();	
System.out.print("Enter marks for subject 4:- ") ;
int s4= sc.nextInt();	
System.out.print("Enter marks for subject 5:- ") ;
int s5= sc.nextInt();	
float total = s1+s2+s3+s4+s5;
float percentage=(total/500)* 100;
System.out.print("total marks id:- " + total) ;
System.out.print("calculating percentage for 5 subject :- ") ;
System.out.println(percentage); 
sc.close();
	}
}