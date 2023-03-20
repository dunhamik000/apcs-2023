package unit10;

public class Pi {

    public static double pi(int n, boolean subtract) {
      if(n>=10000){
        return 0.0;
      }
        if(!subtract){
            return 4.0/((n-1)*(n+1)*(n)) + pi(n+2,!subtract);
        }
        return -4.0/((n-1)*(n+1)*(n)) + pi(n+2,!subtract);

    }

    public static void main(String args[]) {
        double pi = 3.0 + pi(3, false);
        System.out.println("pi = " + pi);
    }
}