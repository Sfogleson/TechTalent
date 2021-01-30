package hWpkg;

	import java.util.Scanner;

   
    
	public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Numbers:");
		asciiChars.printNumbers();
		System.out.println("Lowercase letters:");
		asciiChars.printLowerCase();
		System.out.println("Uppercase letters:");
		asciiChars.printUpperCase();
	
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String nameOne = userInput.nextLine();
		System.out.printf("Hello, %s - ", nameOne);
		System.out.println("Would you like to continue to the interactive portion? Y or N");
		String userContinue = userInput.nextLine();
	    if  (userContinue.equalsIgnoreCase("Y")||  userContinue.equals("Yes")) {
	    	System.out.println("Great, lets go!");
	    	questionLoops ();
	    }
	    else {
	    	System.out.println("Please return later to finish the survey.");
	    	System.exit(0);
	    }
	    
	   userInput.close();
		}
		
		public static void questionLoops() {
			Scanner userInput = new Scanner(System.in);
			String jerseyNumb = "";
			 
			System.out.println("Do you have a red car? (Y or N) ");
			String redCar = userInput.nextLine(); 
			System.out.println("What is the name of your favorite pet? ");
			String favoritePet = userInput.nextLine();
			System.out.println("What is the age of your favorite pet?");
			String petAge = userInput.nextLine();
			System.out.println("What is your lucky number?");
			String luckyNumb = userInput.nextLine();
			System.out.println("Do you have a favorite quarterback? (Y or N)");
			String qbAnswer = userInput.nextLine();
			if (qbAnswer.equalsIgnoreCase("Y")||  qbAnswer.equals("Yes")) {
		    	System.out.println ("What is their Jersey number?");
		    	 jerseyNumb = userInput.nextLine();
			}
		
			System.out.println("What is the two-digit model year of your car?");
			String modelCar = userInput.nextLine();
			System.out.println("What is the first name of your favorite actor or actress?");
			String favCelebrity = userInput.nextLine();
			System.out.println("Enter a random number between 1 and 50");
			String ranNum = userInput.nextLine();
			
			int magicBallNumber = magicBall(luckyNumb,jerseyNumb);
			
			String lotteryNum = lotteryNumbers(modelCar, luckyNumb, favCelebrity, petAge);
			
			System.out.println("Lottery numbers: " + lotteryNum + " Magic ball: " + magicBallNumber);

		}
		
		public static int magicBall(String luckyNumb,String jerseyNumb) {
			int number = 0;
			if (jerseyNumb != "") {
				number = Integer.parseInt(jerseyNumb);
			} else {
				number = Integer.parseInt(luckyNumb);
			}
			
			int answer = (int)(Math.random() * number);
			if (answer > 75) {
				answer = answer - 75 ;
			}
			return answer;
		}
		
		public static String lotteryNumbers (String carModelYear, String luckyNumber, String celebrity, String pet) {
			int lotteryNumber1 = 0;
			int lotteryNumber2 = 0;
			int lotteryNumber3 = 0;
			int lotteryNumber4 = 42;
			int lotteryNumber5 = 0;
			
			
			lotteryNumber1 = Integer.parseInt(carModelYear)+ Integer.parseInt(luckyNumber);
			
			lotteryNumber2 = Character.getNumericValue(celebrity.charAt(0));
			int lengthOfCelebrity = celebrity.length(); 
			lotteryNumber3 = Character.getNumericValue(celebrity.charAt(lengthOfCelebrity - 1));
			
			lotteryNumber5 = Integer.parseInt(pet)+ Integer.parseInt(carModelYear);
			
			return lotteryNumber1 + "," + lotteryNumber2 + "," +  lotteryNumber3 + "," + 
					lotteryNumber4 + "," + lotteryNumber5;
			
			
		}
	}
	

