import java.util.Scanner;

public class GuessTheNumber 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int max = 100;
        int min=1;
        int guessTheNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        int totalGuesses = 0;
        while(true)
        {
            totalGuesses++;
            System.out.println("enter the number");
            int guessedNumber = sc.nextInt();
            if(guessedNumber == guessTheNumber) 
			{
                System.out.println("Great! You have guessed the number in " + totalGuesses + " guesses!Thanks for playing");
                break;
            }
            else if(guessedNumber > guessTheNumber)
                System.out.println("Your Guess is too faar");
            else
                System.out.println("Your guess is too low");

        }

    }
}
