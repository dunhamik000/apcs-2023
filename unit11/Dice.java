package unit11;

public class Dice {
    private int player1;
    private int player2;

    public Dice(){
        player1=0;
        player2=0;
    }

    public static int roll(){
        int roll = (int) (Math.random()*6+1);
        return roll;
    }

    public static int add(int sum1, int sum2, int sum3){
        int sum = sum1+sum2+sum3;
        return sum;
    }

    public static void mexico(){
        System.out.println("Welcome to the game Mexico!");
        System.out.println("Rules: Each player starts the game with 6 lives. Each round two dice are rolled by each player and the sum is added. The player with the lowest rule looses a life. The person that looses all lives first loses");
        int rounds =0;
        int player1Score = 6;
        int player2Score = 6;
        while(player1Score > 0 && player2Score > 0){
            int p11 = roll();
            int p12 = roll();
            int p21 = roll();
            int p22 = roll();
            if(add(p12, p11,0) < add(p22,p21,0)){
                player1Score--;
            }
            else if(add(p12, p11,0) > add(p22,p21,0)){
                player2Score--;
            }
            System.out.println("Player One: "+ player1Score + "   Player Two: " + player2Score);
            rounds++;
        }
        System.out.println(rounds+" rounds played");
        if(player1Score==0){
            System.out.println("Player 1 wins!!!");
        }
        else if(player2Score==0){
            System.out.println("Player 2 wins!!!");
        }
    }

    public static void main(String[] args){
        mexico();
    }

}
