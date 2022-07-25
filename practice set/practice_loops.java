

//problem1 print
// *
// **
// *** 
// ****



// public class practice_loops {
//    public static void main(String[] args) {
       
//     for (int i=1;i<=5;i++){
//       for (int j=1;j<=i;j++){
//       System.out.print("*");
//       }
//       System.out.println();
//     }
//    } 
// }




// problem 2
// print **** 
//       *** 
//       **
//       *


/*public class practice_loops {
    public static void main(String[] args) {
        
     for (int i=5;i>=1;i--){
       for (int j=1;j<=i;j++){
       System.out.print("*");
       }
       System.out.println();
     }
    } 
 } */


//  problem3
//  print sum of n evem numbers

/*public class practice_loops {
    public static void main(String[] args) {
        
    //  Scanner sc=new Scanner(System.in);
    //  System.out.println("enter the last even no");
    //  int n=sc.nextByte();
     int i=1;
     int n=2;
     int sum=0;
     while(i<n){
         sum=sum+(2*i);
         i++;

     }
     System.out.println(sum);
     //0,2,4,6


    } 
 } 
 
 */

 //problem 4 


 public class practice_loops {
    public static void main(String[] args) {
        int n=8;
        int sum=0;
        for (int i=1;i<=10;i++){
        System.out.println(n*i);
        sum=sum +(n*i);
        }
        System.out.println("sum of multiplication of 8 is "+sum);

        
    }

}
        
