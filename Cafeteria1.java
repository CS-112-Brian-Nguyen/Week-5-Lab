import java.util.Scanner;


public class Cafeteria1 {

	public static void main(String[] args) {
		
		Scanner hungry = new Scanner(System.in);
		int a;
		
		System.out.println("I am hungry");
		System.out.println("Get in line");
		System.out.println("Buy Lunch");
		System.out.println("Are you Thirsty? Press, 1 for yes or 0 for no ");
		a = hungry.nextInt();
		
		if (a == 1)
		{
			System.out.println("Buy Coke");
			System.out.println("Eat Lunch");
		}
		else if (a == 0)
		{
			System.out.println("Eat Lunch");
		}
		
		System.out.println("Return Tray");
		System.out.println("Leave");

		hungry.close();
	}

}
