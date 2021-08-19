
import java.util.Scanner;

public class AverageOfThreeNumbers 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();
        double sum = number1 + number2 + number3;
        double avg= sum/3;
        System.out.println("average: "+avg);
    }
}
