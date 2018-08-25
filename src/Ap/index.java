import java.util.Scanner;

class index{
    
   static Scanner scanner=new Scanner(System.in);

 static void ap(int a,int n,int d){
     int an=a+(n-1)*d;
     System.out.println(an+"\n");
 }
 static void sumOfTems(int a,int n,int d){
     int l = n/2+(2*a+(n-1)*d);
     System.out.println(l);
 }

 // 1 2 3 4 5 6-----100
 static void nTermsAp(){
     System.out.println("Enter the nth term");
     int n =scanner.nextInt();
    int ar[]=new int[n];
    int a=0;
    int d=0;
    System.out.println("Enter the n terms for Ap");
    for (int i = 0; i <n; i++) {
       ar[i]=scanner.nextInt();
        a=ar[0];
        d=ar[1]-ar[0]; 
     }
     System.out.println("The calculated ap is");
     ap(a, n, d);
     

 }
 
 public static void main(String [] args){
      System.out.println("Enter the ap terms\n");
     Scanner scanner = new Scanner(System.in);
      System.out.println("enter the first term's");
      int a=scanner.nextInt();

      System.out.println("enter the differnce term's");
      int d=scanner.nextInt();

     System.out.println("enter the last term's");
     int n=scanner.nextInt();

      System.out.println("The calculated ap is");
     ap(a, n, d);
     
      System.out.println("The sum of terms in ap");
     
     sumOfTems(a, n, d);

     //for n terms ap 
       nTermsAp();
       scanner.close();
   
   
 }
}