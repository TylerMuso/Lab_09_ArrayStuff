import java.util.Scanner;

public class SafeInput {

    static Scanner in = new Scanner(System.in);

    public static int getRangedInt(String prompt, int low, int high)
    {
        int value;
        boolean valid = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if(in.hasNextInt())
            {
                value = in.nextInt();

                if(value >= low && value <= high)
                    valid = true;
                else
                    System.out.println("Please enter a number between " + low + " and " + high + ".");
            }
            else
            {
                System.out.println("Invalid input. Please enter an integer.");
                in.next();
                value = 0;
            }

        } while(!valid);

        return value;
    }
}