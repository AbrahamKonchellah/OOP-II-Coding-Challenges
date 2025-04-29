import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random dice = new Random();

        int r1 = dice.nextInt(6) + 1;
        int r2 = dice.nextInt(6) + 1;
        int r3 = dice.nextInt(6) + 1;
        int total = r1 + r2 + r3;

        System.out.println("Rolls: " + r1 + ", " + r2 + ", " + r3);

        if (r1 == r2 && r2 == r3) {
            System.out.println("Triples! +6 bonus");
            total += 6;
        } else if (r1 == r2 || r2 == r3 || r1 == r3) {
            System.out.println("Doubles! +2 bonus");
            total += 2;
        }

        System.out.println("Total: " + total);

        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose.");
        }
    }
}
