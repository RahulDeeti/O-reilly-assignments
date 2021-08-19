
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();
        while(true)
        {
            System.out.println("enter number to continue or -1 to exit");
            double input = sc.nextDouble();
            if(input == -1)
                break;
            numberList.add(input);
        }
        for(int i=numberList.size()-1; i>=0; i--)
            System.out.println(numberList.get(i));
    }
}
