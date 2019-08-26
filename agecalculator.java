import java.util.*;
import java.time.*;

public class agecalculator {
	public static void main(String[] args)
    {
		Scanner year = new Scanner(System.in);

		System.out.println("Enter your year of birth");
		int yr = year.nextInt();
		System.out.println("Enter your month of birth");
		int month = year.nextInt();	
		System.out.println("Enter your day of birth");
		int day = year.nextInt();
        // date of birth
        LocalDate pdate = LocalDate.of(yr, month, day);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
   }
}