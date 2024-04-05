package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		String browser="IE";
		
		switch (browser) {
		
		case "chrome":
			System.out.println("Chrome browser launched");
			break;
			
		case "safari":
			System.out.println("Safari browser launched");
			break;
			
		case "Edge":
			System.out.println("Edge browser launched");
			break;
			
			default:
				System.out.println("IE browser launched");
				break;
				
		}

	}

}
