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

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current percentage in the class? ");
        gradeBefore = scan.nextDouble();

        // letter grade before
        String gradeBeforeLetter = letters(gradeBefore/100);

        System.out.println("How many points are earned on the test/assignment? ");
        points = scan.nextDouble();

        System.out.println("How many points is the test/assignment out of? ");
        outOf = scan.nextDouble();

        // grade on the assignment/test
        double assignmentPercent = points/outOf;
        String assignmentGrade = letters(assignmentPercent);
        
        System.out.println("How many points do you have in the section that has the test/assignment? ");
        sectionPoints = scan.nextDouble();

        System.out.println("How many points is the section that has the test/assignment out of? ");
        sectionPointsOutOf = scan.nextDouble();

        System.out.println("How many sections does the class have other than the section with the test/assignment? ");
        int secNum = scan.nextInt();

        // find what the sections contain
        double [] scores = new double[secNum];
        double [] percent = new double[secNum];
        for(int x=0; x< secNum; x++){
            System.out.println("How many points do you have in section "+ (x+1));
            scores [x] = scan.nextDouble();
            System.out.println("How many points is this section out of? ");
            scores[x] /= scan.nextDouble();
            System.out.println("What percent of the grade is this section? ");
            percent[x] = scan.nextDouble();
        }

        // find what percent the original section was out of
        double percentO = 0;
        for(int x = 0; x< percent.length; x++){
            percentO += percent[x];
        }
        percentO = 100 - percentO;
        
        // figure out the final percentage
        double finall = (((sectionPoints+points)/(sectionPointsOutOf + outOf))*percentO);
        for(int b = 0; b<scores.length; b++){
            finall+=((scores[b])*percent[b]);
        }

        // calculate the letter grade of the class
        String finalLetter= letters(finall);
        finall = finall*100; 
        finall = Math.round(finall);
        finall = finall/100;

        System.out.println("Letter grade of the test/assignment: " + assignmentGrade);
        System.out.println("Overall letter grade in the class before: " + gradeBeforeLetter);
        System.out.println("Overall grade in the class before as a percentage: " + gradeBefore);
        System.out.println("Overall letter grade in the class after: " + finalLetter);
        System.out.println("Overall grade in the class after as a percentage: " + finall);
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

