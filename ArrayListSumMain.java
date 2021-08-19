
import java.util.ArrayList;

public class ArrayListSumMain
 {
    public static void main(String[] args) 
	{
        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(430);
        list.add(96);
        list.add(5999);
        int sum;
        sum = ArrayListSum(list);
        System.out.println("sum is : "+sum);
    }
    public static int ArrayListSum(ArrayList<Integer> arrayListSum)
    {
        int sum=0;
        for (int val: arrayListSum)
		{
            sum += val;
        }
        return sum;
    }
}
