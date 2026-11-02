import java.util.Random;

public class Main {
    void main() {
        final int DATA_SIZE = 100;
        int sum = 0;

        Random rnd = new Random();

        //Allocate the memory for the array
        int[] dataPoints = new int[DATA_SIZE];

        //initialize to a random value
        for(int s = 0; s < dataPoints.length; s++)
            dataPoints[s] = rnd.nextInt(100) + 1;

        //display the array values
        for(int s = 0; s < dataPoints.length; s++)
        {
            if(s > 0)
                IO.print(" | ");

            IO.print(dataPoints[s]);
        }

        IO.println();

        //sum + average
        for(int point : dataPoints)
            sum += point;

        IO.println("The sum of the random array dataPoints is: " + sum);

        double average = (double)sum / dataPoints.length;
        IO.println("The average of the random array dataPoints is: " + average);

        //find all occurrences
        int target = SafeInput.getRangedInt("Enter a number to search for", 1, 100);
        int count = 0;

        for(int s = 0; s < dataPoints.length; s++)
            if(dataPoints[s] == target)
                count++;

        IO.println("The value " + target + " was found " + count + " times in dataPoints.");

        //find first occurrence
        target = SafeInput.getRangedInt("Enter another number to search for", 1, 100);
        boolean found = false;

        for(int s = 0; s < dataPoints.length; s++)
        {
            if(dataPoints[s] == target)
            {
                IO.println("The value " + target + " was found at array index " + s + ".");
                found = true;
                break;
            }
        }

        if(!found)
            IO.println("The value " + target + " was not found in dataPoints.");

        //find minimum and maximum
        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int s = 1; s < dataPoints.length; s++)
        {
            if(dataPoints[s] < min)
                min = dataPoints[s];

            if(dataPoints[s] > max)
                max = dataPoints[s];
        }

        IO.println("The minimum value in dataPoints is: " + min);
        IO.println("The maximum value in dataPoints is: " + max);

        IO.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        double sum = 0;

        for(int value : values)
            sum += value;

        return sum / values.length;
    }
}