import java.util.Scanner;

public class DiscountCalc {
    public static void main(String[] args) {
        double price, discounted;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide the item's price: ");
        price=scanner.nextDouble();
        System.out.println("Please, enter the customer's age: ");
        age=scanner.nextInt();
        if(age < 1)
        {
            discounted = 1;
            System.out.println("It seems that the customer have not even been born yet. No discount, sorry.");
        }
        else if(age < 6)
        {
            discounted = 0.2;
        }
        else if (age >=6 && age <=18)
        {
            discounted = 0.75;
        }
        else if (age > 65)
        {
            discounted = 0.7;
        }
        else
        {
            discounted = 1;
        }
        System.out.printf("Discounted price is %.2f", discounted * price );
    }
}
