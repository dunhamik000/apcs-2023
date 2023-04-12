package unit11;

// 2019 FRQ #2
// https://apcentral.collegeboard.org/media/pdf/ap19-frq-computer-science-a.pdf#page=7
public class StepTracker {

    private int steps;
    private int days;
    private int activeDay;
    private int min;

    public StepTracker(int x){
        min=x;
        days=0;
        activeDay=0;
        steps=0;
    }

    public void addDailySteps(int a){
        days++;
        steps=steps+a;
        if(a>=min){
            activeDay++;
        }
    }

    public int activeDays(){
        return activeDay;
    }

    public double averageSteps(){
        if(days==0){
            return 0.0;
        }
        return 1.0*steps/days;
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("bad panda");
    }

    public static void main(String[] args) {
        // uncomment the following lines to test your code
        StepTracker tr = new StepTracker(10000);
        check(tr.activeDays() == 0);
        check(tr.averageSteps() == 0.0);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        check(tr.activeDays() == 0);
        check(tr.averageSteps() == 7000.0);
        tr.addDailySteps(13000);
        check(tr.activeDays() == 1);
        check(tr.averageSteps() == 9000.0);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        check(tr.activeDays() == 2);
        check(tr.averageSteps() == 10222.2);
        System.out.println("Happy Panda! \uD83D\uDC3C");
    }
}
