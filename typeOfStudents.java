import java.io.*;
import java.util.*;

public class typeOfStudents{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float mark1 = sc.nextFloat();
		float mark2 = sc.nextFloat();
		float mark3 = sc.nextFloat();
		float mark4 = sc.nextFloat();
		double averageMark = mark1 + mark2 + mark3*2.0+ mark4*3.0;
		if(averageMark >= 8){
			System.out.printf("GIOI\n");
		}
		else if(averageMark >= 6.5 && averageMark < 8){
			System.out.printf("KHA\n");
		}
		else if(averageMark >= 5 && averageMark < 6.5){
			System.out.printf("TRUNG BINH\n");
		}
		else{
			System.out.printf("YEU\n");
		}
	}
}