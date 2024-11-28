import java.util.Scanner;

public class IT24104198Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of new members introduced: ");
        int members = scanner.nextInt();

        String prize;

        switch (members) {
            case 0:
                prize = "No Prize";
		System.out.println("Prize is: " + prize);

                break;

            case 1:
                prize = "Pen";
		System.out.println("Prize is: " + prize);

                break;

            case 2:
                prize = "Umbrella";
		System.out.println("Prize is: " + prize);

                break;

            case 3:
                prize = "Bag";
		System.out.println("Prize is: " + prize);

                break;

            case 4:
                prize = "Travelling Chair";
		System.out.println("Prize is: " + prize);

                break;

            case 5:
                prize = "Headphone";
		System.out.println("Prize is: " + prize);

                break;

            default:
      		if (members > 5) {
                    prize = "Headphone";
		    System.out.println("Prize is: " + prize);

                } else {
                    System.out.println("Input must be a number 0 or greater");
                }
                break;

        }

     

        scanner.close();
    }
}		