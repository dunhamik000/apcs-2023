package unit10;

public class Recur {

    // takes in a int n and then keeps opening until it gets to where n==0. 
    // Then it will times 1 by 3 and then keep timsing by three until it gets 
    // to the number n that it imputed 
    // input 5, output 234
    public static int fun3(int n) {
        if (n == 0)
            return 1;
        else
            return 3 * fun3(n - 1);
    }

    // take in an int end and then adds n-1 and -2 until it gets to either 0 or 1
    // then it will run it through starting at 1 or 0
    // input 6, output 8
    public static int f(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return f(n - 1) + f(n - 2);
    }

    // takes in a string and if it is greater than two letters, it either returns true if there are two letters that are the same
    // returns false if there are no letters the same
    // input howdy, output false
    // input hello, output true
    public static boolean has(String input) {
        if (input.length() < 2)
            return false;
        return (input.charAt(0) == input.charAt(1) || has(input.substring(1)));
    }

    // takes in a string 
    // returns true if it is a planandrom
    // input deified, returns true
    // input deepfried, returns false
    public static boolean pot(String input) {
        if (input.length() < 2)
            return true;
        return (input.charAt(0) == input.charAt(input.length() - 1)
                && pot(input.substring(1, input.length() - 1)));
    }

    //Takes in an int and the goes until the int is zero
    //It is going to divide 1 by 1/2 the amount of times of n
    // returns a double 
    // input 6, output 0.4142...
    public static double two(int n) {
        if (n < 1)
            return 1.0 / 2;
        return 1.0 / (2 + two(n - 1));
    }

    // takes in an int and outputs a string
    // returns a string
    // adds n divided by two and then added to n%2
    // input 10, ouptput 1011
    public static String mop(int n) {
        if (n / 2 == 0)
            return "" + n % 2;
        return mop(n / 2) + n % 2;
    }

    // takes in an int and returns and int 
    // adds x%10 with x by 10 until reaches x
    // input 4096, output 19
    public static int cat(int x) {
        if (x == 0)
            return x;
        return ((x % 10) + cat(x / 10));
    }

    // takes in an int and returns an int 
    // does 4 and then adds on two it each time
    // input 10, output 37
    public static int mystery(int x) {
        if (x <= 1)
            return 1;
        // return mystery(x - 1) + mystery(x - 2);
        // return 2 * mystery(x - 2);
        // return 2 * mystery(x - 1);
        // return 4 * mystery(x - 4);
        return 4 + mystery(x - 1);
    }

    public static void main(String[] args) {

        // Consider function fun3
        System.out.println(fun3(5));

        // Consider function f
         System.out.println(f(6));

        // Consider function has
        System.out.println(has("hello"));
        System.out.println(has("howdy"));

        // Consider function pot
         System.out.println(pot("deified"));
         System.out.println(pot("deepfried"));

        // Consider function two
         System.out.println(two(6));

        // Consider function mop
         System.out.println(mop(11));

        // Consider function cat
         System.out.println(cat(4096));

        // Fix function mystery so that mystery(10) == 32
         System.out.println(mystery(10));

    }

}
