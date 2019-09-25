package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static String getHoroscope(Zodiac z) {
		String horo = "";
		
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "You will die");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "You will become a bull");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "You will find our soul sister(or brother)");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "You know what");
			break;
		case LEO: 
			JOptionPane.showMessageDialog(null, "You will grow long beautiful hair");
			break;
		case VIRGO: 
			JOptionPane.showMessageDialog(null, "You ego will disappear");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "You will grow scale on your left thumb");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "You will get burned and it will sting");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "You will go back in time to the dinosaurs");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "You will discover a unicorn with a hat on");
			break;
		case AQUARIUS: 
			JOptionPane.showMessageDialog(null, "YOu can know breath underwater ");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "You look like a fish");
			break;
		}
		
		return horo;
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac zod = Zodiac.LEO;
		getHoroscope(zod);
	}
	
}
