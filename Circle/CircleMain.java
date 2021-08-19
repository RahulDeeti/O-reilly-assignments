public class CircleMain 
{
    public static void main(String[] args)
	{
        Circle unit = new Circle();
        Circle circle2 =new Circle(9);

        printCircleData(unit);
        printCircleData(circle2);
    }
    public static void printCircleData(Circle circle)
    {
        System.out.println("Radius : " +circle.getRadius());
        System.out.println("Circumference : " +circle.getCircumference());
        System.out.println("Area : "+circle.getArea());

    }
}
