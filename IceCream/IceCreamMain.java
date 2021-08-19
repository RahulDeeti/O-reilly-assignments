
public class IceCreamMain 
{
    public static void main(String[] args) 
	{
        IceCream myIceCream =new IceCream("vanilla",2);
        IceCream iceCream2 = new IceCream("Chocolate", 3);
        myIceCream.addToppings("cherries");
        myIceCream.addToppings("nuts");

        iceCream2.addToppings("sprinkles");
        printIceCream(myIceCream);
        printIceCream(iceCream2);
    }

    private static void printIceCream(IceCream icecream)
	{
        System.out.println(icecream.getName());
        System.out.println(icecream.getCost());
        System.out.println("Toppings :");
        icecream.printToppings();
    }
}
