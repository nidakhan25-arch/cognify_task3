import java.util.Scanner;

public class gradecalci
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of grades: ");
        int numOfGrades = scanner.nextInt();


        double[] grades = new double[numOfGrades];
        double total = 0;


        for (int i = 0; i < numOfGrades; i++)

        {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }


        double average = total / numOfGrades;

        System.out.printf("The average grade is: %.2f%n ", average);

        scanner.close();
    }
}