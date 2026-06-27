import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Subjects : ");
        int subjects = scanner.nextInt();

        int total = 0;
        int count = 1;

        while(subjects >= count) {
            System.out.print("Enter marks for Subject " + count + " (out of 100) : ");
            int marks = scanner.nextInt();

            if(marks>100 || marks<0) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.!");
            }

            total += marks;
            count++;
        }

        double average = (double)total/subjects;
        char grade;

        if(average >= 90) {
            grade='A';
        } else if(average >= 80) {
            grade='B';
        } else if(average >= 70) {
            grade='C';
        } else if(average >= 60) {
            grade='D';
        } else if(average >= 50) {
            grade='E';
        } else {
            grade='F';
        }

        System.out.println("\n==========RESULT==========");
        System.out.println("Total marks : "+total);
        System.out.println("Average : "+average);
        System.out.println("Grade : "+grade);

        scanner.close();
    }
    
}
