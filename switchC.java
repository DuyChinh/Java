import java.io.*;
import java.util.*;

public class switchC {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int year = sc.nextInt();
		if(year > 0 && month > 0 && month < 13)
		{
			int daysMonth;
			switch(month) {
				case 2:
					if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
						daysMonth = 29;
					}
					else{
						daysMonth = 28;
					}
					break;
				case 1, 3, 5, 7, 8, 10, 12:
					daysMonth = 31;
					break;
				default:
					daysMonth = 30;
					break;
			}
			System.out.print(daysMonth);
		}
		else{
			System.out.print("INVALID");
		}
	}
}