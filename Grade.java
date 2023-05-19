import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        double gradeBefore;
        String letterGradeBefore;
        double points;
        double outOf;
        double sectionPoints;
        double sectionPointsOutOf;
        double sections;


        Scanner scannnnnn = new Scanner(System.in);
        System.out.println("What is your current percentage in the class? ");
        gradeBefore = scannnnnn.nextDouble();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many points are earned on the test/assignment? ");
        points = scan.nextDouble();

        Scanner scann = new Scanner(System.in);
        System.out.println("How many points is the test/assignment out of? ");
        outOf = scann.nextDouble();

        double assignmentPercent = points/outOf;
        String assignmentGrade = letters(assignmentPercent);
        

        Scanner scannn = new Scanner(System.in);
        System.out.println("How many points are in the section that has the test/assignment? ");
        sectionPoints = scannn.nextDouble();

        Scanner scannnn = new Scanner(System.in);
        System.out.println("How many points is the section that has the test/assignment out of? ");
        sectionPointsOutOf = scannnn.nextDouble();

        Scanner scannnnn = new Scanner(System.in);
        System.out.println("How many points are in the section that has the test/assignment? ");
        sections = scannnnn.nextDouble();

        System.out.println("Letter grade of the test/assignment: " + assignmentGrade);
        System.out.println("Overall letter grade in the class before: ");
        System.out.println("Overall grade in the class before as a percentage: ");
        System.out.println("Overall letter grade in the class after: ");
        System.out.println("Overall grade in the class after as a percentage: ");
    }
    
    public static String letters(double a){
        String x;
        if(a>=0.93){
            x = "A";
        }
        else if(a>=0.90){
            x = "A-";
        }
        else if(a>=0.87){
            x = "B+";
        }
        else if(a>=0.83){
            x = "B";
        }
        else if(a>=0.80){
            x = "B-";
        }
        else if(a>=0.77){
            x = "C+";
        }
        else if(a>=0.73){
            x = "C";
        }
        else if(a>=0.70){
            x = "C-";
        }
        else if(a>=0.67){
            x = "D+";
        }
        else if(a>=0.60){
            x = "D";
        }
        else{
            x = "F";
        }
        return x;
    }
}

