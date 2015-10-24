package textadventure;
import java.io.InputStream;
import java.util.Scanner;

public class textadventure1 {
	public static void main(String args[]) {
		
		
		
		System.out.println("Welcome to this text adventure. To play, you will be given a couple choices, with a number in the front. You will need to input the number displayed. Let's get started.");
		System.out.println("");
		System.out.print("You wake up in a dark room. It is cold outside. What do you want to do?");
		System.out.println("");
		System.out.println("You can either:");
		System.out.println("1) Look for a way to escape");
		System.out.println("2) Look around for supplies");
		System.out.println("3) Wait");
		System.out.println("");
		System.out.println("What do you want to do?");
		
		Scanner inputscan = new Scanner(System.in);
		int input = inputscan.nextInt();
		
		if (input == 1){
			System.out.println("You chose to look for a way to escape");
		}
		if (input == 2){
			System.out.println("You chose to look around for supplies");
		}
		if (input == 3){
			System.out.println("You chose to wait in the dark room");
		}
	}
}
