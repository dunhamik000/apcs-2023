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

        Scanner scannn = new Scanner(System.in);
        System.out.println("How many points are in the section that has the test/assignment? ");
        sectionPoints = scannn.nextDouble();

        Scanner scannnn = new Scanner(System.in);
        System.out.println("How many points is the section that has the test/assignment out of? ");
        sectionPointsOutOf = scannnn.nextDouble();

        Scanner scannnnn = new Scanner(System.in);
        System.out.println("How many points are in the section that has the test/assignment? ");
        sections = scannnnn.nextDouble();

        System.out.println("Letter grade of the test/assignment: ");
        System.out.println("Overall letter grade in the class before: ");
        System.out.println("Overall grade in the class before as a percentage: ");
        System.out.println("Overall letter grade in the class after: ");
        System.out.println("Overall grade in the class after as a percentage: ");
    }
}

