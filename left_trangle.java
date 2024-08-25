package assignment2;
import java.util.Scanner;
public class left_trangle {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number:");
	int n;
	n=sc.nextInt();
	for(int i=1; i<=n; i++) {
		for(int j=2*(n-i);j>=1; j--) {
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
