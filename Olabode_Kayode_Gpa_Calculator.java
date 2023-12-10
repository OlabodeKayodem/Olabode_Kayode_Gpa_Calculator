package olabode_kayode_gpa_calculator;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Olabode_Kayode_Gpa_Calculator {
    public static void main(String[] args) {
        
// Input the number of courses
        try (Scanner x = new Scanner(System.in)) {
            // Input the number of courses
            System.out.println("THIS JAVA CODE CALCULATES GPA (GRADE POINT AVERAGE) ON A 5.0 SCALE.");
            System.out.println(" ");
            System.out.print("Please Enter the Number of Courses: ");
            int course_number = x.nextInt();
            
            // Arrays to store course names, credit units, and scores
            String[] courseNames = new String[course_number];
            int[] creditUnits = new int[course_number];
            double[] scores = new double[course_number];
            
            // Input information for each course
            // Input information for each course
            for (int i = 0; i < course_number; i++) {
            System.out.println("\nEnter Course Details " + (i + 1) + ":");

            // Input Course Name
            System.out.print("Course Name: ");
            x.nextLine();  // Consume the newline character
            courseNames[i] = x.nextLine();

            // Input Credit Units
            System.out.print("Course Units: ");
            creditUnits[i] = Integer.parseInt(x.nextLine());

            // Input Score
            System.out.print("Course Score: ");
            scores[i] = x.nextDouble();
}

            
            // Calculate grades and print the table
            System.out.println("\nBEHOLD YOUR RESULT!");
            System.out.println("");
            System.out.println("|----------------|--------------|---------|----------|");
            System.out.printf("%-17s%-15s%-10s%-12s%n", "COURSE & CODE", "COURSE UNIT", "GRADE", "GRADE-UNIT");
            System.out.println("|----------------|--------------|---------|----------|");
           
            
            int totalQualityPoints = 0;
            int totalCreditUnits = 0;
            
            for (int i = 0; i < course_number; i++) {
                String grade = getGrade(scores[i]);
                int gradePoint = getGradePoint(scores[i]);
                
                totalQualityPoints += gradePoint * creditUnits[i];
                totalCreditUnits += creditUnits[i];
                
                // Inside the loop
                System.out.printf("%-17s%-15d%-10s%-10d%n", courseNames[i], creditUnits[i], grade, gradePoint);
        
            }
            
            double gpa = (double) totalQualityPoints / totalCreditUnits;
            
            System.out.println("|----------------|--------------|---------|----------|");
            // Format GPA to two decimal places
            DecimalFormat df = new DecimalFormat("#.##");
            String formattedGPA = df.format(gpa);
            
            

            System.out.println("\nYour GPA is = " + formattedGPA);
        }
    }

    // Method to calculate the grade based on the score
    private static String getGrade(double score) {
        if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else if (score >= 45) {
            return "D";
        } else if (score >= 40) {
            return "E";
        } else {
            return "F";
        }
    }

    // Method to calculate the grade point based on the score
    private static int getGradePoint(double score) {
        if (score >= 70) {
            return 5;
        } else if (score >= 60) {
            return 4;
        } else if (score >= 50) {
            return 3;
        } else if (score >= 45) {
            return 2;
        } else if (score >= 40) {
            return 1;
        } else {
            return 0;
        }
    }
}