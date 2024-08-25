package assignment2;
import java.util.Scanner;
public class armstrong_number {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("enter number:");
 int num,arm=0,c,rem;
num=sc.nextInt();
c=num;
 while(num>0) {
	 rem=num%10;
	 arm=(rem*rem*rem)+arm;
	 num=num/10;
 }
 if(c==arm) {
	 System.out.print("armstrong number");
 }
 else {
	 System.out.print("not armstrong number"); 
 }
 

	}

}
