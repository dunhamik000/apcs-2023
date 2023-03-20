public class ClassWork{

    static int power1(int a, int b) {
            if (b==1){
                return a;
            } else{
                int nextPower = power(a, b/2);
                if (b%2 == 1){
                    return nextPower *nextPower*2;
                }
                else{
                    return nextPower *nextPower;
                }
            }
    }

    static int power(int a, int b) {
        if (b==1){
            return a;
        } else{
            int nextPower = power(a, b/2);
            if (b%2 == 1){
                return nextPower *nextPower*2;
            }
            else{
                return nextPower *nextPower;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(power(3,2));
        System.out.println(power1(3,2));
    }
}