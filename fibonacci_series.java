package assignment2;
import java.util.Scanner;
public class fibonacci_series {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
 int a=0,b=1,c,n;
 n=sc.nextInt();
 for(int i=1; i<=n; i++) {
	 System.out.print(a+" ");
	 c=a+b;
	 a=b;
	 b=c;
 }
 

	}

}
