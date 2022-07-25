import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        int x,y,z;   
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x :");
         x =sc.nextInt();
         System.out.println("enter y :");
         y =sc.nextInt();
         System.out.println("enter z :");
         z =sc.nextInt();
sc.close();
      
      System.out.println("the smallest of all no. is " + Smallest(x,y,z));
      System.out.println("the average of three no. is "+Average(x, y, z));
   }
   static int Smallest(int a ,int b, int c ){
    if(a<b && a<c){
    return a;
    }
    else if( b<a && b<c){
    return b;
    }
    else 
    return c;
  }

  static int Average(int a,int b,int c){
      int avg=(a+b+c)/3;
      return avg;

  }
}


