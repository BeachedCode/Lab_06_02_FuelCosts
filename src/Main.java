import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double numGallons = 0;
        double fuelEff = 0;
        double gasPrice = 0;
        String trash = "";

        System.out.println("Enter the number of gallons in the tank: ");

        if(in.hasNextDouble())
        {
            numGallons = in.nextDouble();
            System.out.println("Miles per gallon: ");
            if(in.hasNextDouble())
            {
                fuelEff = in.nextDouble();
                System.out.println("Price of gas: ");
                if(in.hasNextDouble())
                {
                    gasPrice = in.nextDouble();
                    double mileCost = 100 * gasPrice;
                    System.out.println("Cost every 100 miles: $" + mileCost);
                    double howFar = fuelEff * numGallons;
                    System.out.println("Your car can go " + howFar + " miles.");
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a number. Try again.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a number. Try again.");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number. Try again.");
        }

    }
}