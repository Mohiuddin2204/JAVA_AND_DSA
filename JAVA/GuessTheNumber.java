import java.util.Random;
import java.util.Scanner;

class Game {
    int n;
    int guesses=0;
    int input;

    public Game() {
        Random r = new Random();
        this.n = r.nextInt(100);     //[0,99)
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    void takeUserInput() {
        System.out.println("guess: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }

    boolean isCorrect() {
        this.guesses++;
        if (this.input == this.n) {
            System.out.println("done and dusted it is "+this.n);
            return true;
        }
        else if(this.input<this.n){
            System.out.println("less, think higher");
        }
        else{
            System.out.println("high, think lower");
        }
        return false;

    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
    Game g=new Game();
    boolean b=false;
    while(!b) {
        g.takeUserInput();
        b = g.isCorrect();
        System.out.println(b);
    }
        System.out.println("guess count= "+ g.guesses );
    }
}
