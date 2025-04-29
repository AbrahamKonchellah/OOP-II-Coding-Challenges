import java.util.Scanner;

public class Countdown {
    Scanner scanner = new Scanner(System.in);

        public static void countDown() {
        int start;
        System.out.print("Enter a number to count down from: ");
        start = scanner.nextInt();
    
        while (start > 0) {
            System.out.println("Countdown: " + start);
            start--;
        }
        public static void main(String[]args){
            (new Countdown()).countDown();
        }
    }
}
