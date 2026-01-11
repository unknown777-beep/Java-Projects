import java.util.Scanner;

public class Grade_Tracker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[numStudents];
        double[] grades = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter grade for " + names[i] + ": ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        double sum = 0;
        int topIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (grades[i] > grades[topIndex]) {
                topIndex = i;
            }
        }

        double average = sum / numStudents;

        System.out.println("\n--- Performance Summary ---");
        System.out.printf("Class Average: %.2f\n", average);
        System.out.println("Top Performer: " + names[topIndex] + " with " + grades[topIndex]);
        
        scanner.close();
    }
}
