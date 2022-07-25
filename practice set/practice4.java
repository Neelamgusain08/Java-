
public class practice4 {
    /*
     * \\print the table of no. n
     * 
     * static void Table(int n){
     * for(int i=1;i<=10;i++)
     * System.out.format("%d x %d =%d\n",n,i,n*i);
     * }
     * public static void main(String[] args) {
     * int x;
     * Scanner sc=new Scanner(System.in);
     * System.out.println("enter the no");
     * 
     * Table( x=sc.nextInt());
     * 
     * 
     * }
     */

    // print the pattern

    /*
     * static void pattern1(int n){
     * int j;
     * for(int i=0;i<=n;i++){
     * for(j=0;j<=i;j++){
     * System.out.print("* ");
     * }
     * System.out.println();
     * }
     * }
     * static void pattern2(int n){
     * int j;
     * for(int i=0;i<=n;i++){
     * for(j=n;j>=i+1;j--){
     * System.out.print("* ");
     * }
     * System.out.println();
     * }
     * }
     * public static void main(String[] args){
     * pattern1(5);
     * pattern2(5);
     * 
     * }
     * 
     */

    // sum of n number using recursion

    /*
     * static int sum(int n){
     * if (n==1){
     * return 1;
     * }
     * else
     * 
     * return n+sum(n-1);
     * }
     * 
     * public static void main(String[] args)
     * {
     * System.out.println(sum(50));
     * }
     * 
     * }
     * }
     */

    // fibonacci series 0,1,1,2,3,5,8,13,21,34...

    static int fib(int n) {
        if (n == 1 || n == 2)
            return n - 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }

}
