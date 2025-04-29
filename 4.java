import java.util.Scanner;

public class UserInput{
        Scanner input = new Scanner(System.in);

        public void readDetails(){
        String name;
        int age;
        System.out.print("Enter your name: ");
             name = input.nextLine();
        System.out.println("Enter your age:")
             age=input.nextInt();
        System.out.println("Hello, " + name + "! You are "+ age + "years old");
    

        public static void main(String[]args){
            (new UserInput()).readDetails();
        }
    }
}