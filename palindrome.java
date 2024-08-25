package assignment2;
import java.util.Scanner;
public class palindrome {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
int n,a=0,digit=0,temp=0;
n=sc.nextInt();
temp=n;
do {
	digit=n%10;
	temp=temp/10;
	a=a*10+digit;
}while(temp>0);
if(a==n) {
	System.out.print("palindrome number");
}

else {
	System.out.print("not palindrome number");
}

	}

}
