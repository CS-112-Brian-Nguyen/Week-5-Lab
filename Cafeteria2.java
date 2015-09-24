import java.util.Scanner;


public class Cafeteria2 {

	public static void main(String[] args) {
		
		Scanner decision = new Scanner(System.in);
		int a,b;
		
		System.out.println("I am hungry");
		System.out.println("Get in line");
		System.out.println("Buy Lunch");
		System.out.println("Are you Thirsty? Press, 1 for yes or 0 for no.");
		a = decision.nextInt();
		if (a == 1)
		{
			System.out.println("You are thirsty, Press, 1 if you ate breakfast, 0 if no.");
			b = decision.nextInt();
			if (b == 1)
			{
				System.out.println("Buy Diet Coke");
			}
			else if(b == 0)
			{
				System.out.println("Buy Coke");
			}
		}
		else if (a == 0)
		{
			System.out.println("Buy Water");
		}
		System.out.println("Eat Lunch");
		System.out.println("Return Tray");
		System.out.println("Leave");

		decision.close();
	}

}
