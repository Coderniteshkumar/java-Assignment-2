package assignment2;
import java.util.Scanner;
public class table {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
int n;
n=sc.nextInt();
for(int i=1;i<=10; i++) {
	System.out.println(n+"*"+i+"="+n*i);
}

	}

}
