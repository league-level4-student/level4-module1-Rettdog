package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(input) {
		case 0:
			System.out.println("Watch out for school");
			break;
		case 1:
			System.out.println("UUUUGGGGGGGGHHHHHHHHH!!!!!!!!!!!!!!!!!");
			break;	
		case 2:
			System.out.println("You done with homework yet?");
			break;	
		case 3:
			System.out.println("HOUR LUNCH!");
			break;	
		case 4:
			System.out.println("all--most there.....");
			break;	
		case 5:
			System.out.println("Just 2 more hours");
			break;	
		case 6:
			System.out.println("I'm free!!!!!!!!");
			break;	
		
		
		}
		
	}
}
