import java.util.Scanner;

public class FootballQBRater {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of touchdown passes: ");
		double touchdown = input.nextDouble();
		
		System.out.println("Enter total number of passing yards: ");
		double yards = input.nextDouble();
		
		System.out.println("Enter number of interceptions: ");
		double intercept = input.nextDouble();
		
		System.out.println("Enter number of completions: ");
		double complete = input.nextDouble();
		
		System.out.println("Enter number of passes attempted: ");
		double attempt = input.nextDouble();
		
		double weightA = (complete/attempt - 0.3)*5;
		double weightB = (yards/attempt - 3)*0.25;
		double weightC = (touchdown/attempt)*20;
		double weightD = 2.375 - (intercept/attempt)*25;
		double passerRating = ((weightA + weightB + weightC + weightD)/6)*100;
		
		System.out.printf("The quarterback's rating is: %2.1f%%", passerRating);

	}

}