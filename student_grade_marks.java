package assignment2;
import java.util.Scanner;
public class student_grade_marks {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter student marks:");
int marks;
marks=sc.nextInt();
if(marks>=90 && marks<=100) {
	System.out.print("grade AA");
}
else if(marks>=70 && marks<90) {
	System.out.print("grade A");
}

else if(marks>=50 && marks<70) {
	System.out.print("grade BB");
}

else if(marks>=40 && marks<50) {
	System.out.print("grade B");
}

else if(marks>=30 && marks<40) {
	System.out.print("grade cc");
}

else if(marks>=20 && marks<30) {
	System.out.print("grade c");
}

else {
	System.out.print("fail");
}
}

}
